import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class State {
    public byte map[][] = new byte [2][4];
    public State nextState[] = new State[4];
	public State parentState;
	public boolean isEndState(){
		int i;
		for(i = 0; i < 8; i++){
			if(this.map[i / 4][i % 4] != i){
				return false;
			}
		}
		return true;
	}
	public void extendTree(){
		int i;
		if(this.hasSameMapInHistory(this.map)){
			this.removeFromParent();
			return;
		}
		if(this.hasChild()){
			for(i = 0; i < 4; i++){
				if(this.nextState[i] != null){
					this.nextState[i].extendTree();
				}
			}
			return;
		}
		int p0x = 0, p0y = 0;
		for(i = 0; i < 8; i++){
			if(this.map[i / 4][i % 4] == 0){
				p0x = i % 4;
				p0y = i / 4;
				break;
			}
		}
		if(i == 8){
			return;
		}
		if(p0y == 1){
			this.nextState[0] = new State();
			this.nextState[0].copyFrom(this.map);
			this.nextState[0].exchange(p0x, 0, p0x, 1);
			this.nextState[0].parentState = this;
		}
		if(p0x != 3){
			this.nextState[1] = new State();
			this.nextState[1].copyFrom(this.map);
			this.nextState[1].exchange(p0x, p0y, p0x + 1, p0y);
			this.nextState[1].parentState = this;
		}
		if(p0y == 0){
			this.nextState[2] = new State();
			this.nextState[2].copyFrom(this.map);
			this.nextState[2].exchange(p0x, 0, p0x, 1);
			this.nextState[2].parentState = this;
		}
		if(p0x != 0){
			this.nextState[3] = new State();
			this.nextState[3].copyFrom(this.map);
			this.nextState[3].exchange(p0x, p0y, p0x - 1, p0y);
			this.nextState[3].parentState = this;
		}
	}
	public boolean hasChild(){
		int i;
		for(i = 0; i < 4; i++){
			if(this.nextState[i] != null){
				return true;
			}
		}
		return false;
	}
	public void copyFrom(byte src[][]){
		int i;
		for(i = 0; i < 8; i++){
			this.map[i / 4][i % 4] = src[i / 4][i % 4];
		}
	}
	public void printMap(){	
		System.out.println(Arrays.toString(this.map[0]));
		System.out.println(Arrays.toString(this.map[1]));
		System.out.println();
	}
	public void exchange(int px, int py, int qx, int qy){
		byte tmp;
		tmp = this.map[py][px];
		this.map[py][px] = this.map[qy][qx];
		this.map[qy][qx] = tmp;
	}
	public boolean hasEndState(){
		int i;
		if(this.hasChild()){
			for(i = 0; i < 4; i++){
				if(this.nextState[i] != null && this.nextState[i].hasEndState()){
					return true;
				}
			}
			return false;	
		}
		return this.isEndState();
	}
	public boolean hasSameMapInHistory(byte map[][]){
		if(this.parentState == null){
			return false;
		}
		int i;
		for(i = 0; i < 8; i++){
			if(this.parentState.map[i / 4][i % 4] != map[i / 4][i % 4]){
				return this.parentState.hasSameMapInHistory(map);
			}
		}
		return true;
	}
	public void removeFromParent(){
		int i;
		this.parentState.nextState[Arrays.asList(this.parentState.nextState).indexOf(this)] = null;
		for(i = 0; i < 4; i++){
			if(this.parentState.nextState[i] != null){
				break;
			}
		}
		if(i == 4){
			this.parentState.removeFromParent();
		}
		this.parentState = null;
	}
}

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		try {
			for(;;){
				State rootState = new State();
				buf = br.readLine();
				if(buf == null){
					break;
				}
				Scanner scanner = new Scanner(buf);
				if(!scanner.hasNext()){
					break;
				}
				int i;
				byte initState[][] = new byte[2][4];
				for(i = 0; i < 8; i++){
					initState[i / 4][i % 4] = scanner.nextByte();
				}
				rootState.copyFrom(initState);
				for(i = 0; ; i++){
					if(rootState.hasEndState()){
						System.out.println(i);
						break;
					}
					rootState.extendTree();
				}

			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}