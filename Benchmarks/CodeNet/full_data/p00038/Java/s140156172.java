import java.util.*;
import java.awt.geom.*;
import java.io.*;
public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String [] input = sc.next().split(",");
			int [] data = new int[5];
			for(int i = 0 ; i < 5; i++){
				data[i] = Integer.parseInt(input[i]);
			}
			Arrays.sort(data);
			//System.out.println(Arrays.toString(data));
			if(isfour(data)){
				System.out.println("four card");
			}
			else if(isfull(data)){
				System.out.println("full house");
			}
			else if(isstraight(data)){
				System.out.println("straight");
			}
			else if(isthree(data)){
				System.out.println("three card");
			}
			else if(istwo(data)){
				System.out.println("two pair");
			}
			else if(one(data)){
				System.out.println("one pair");
			}
			else{
				System.out.println("null");
			}
		}
	}

	private boolean one(int[] data) {
		for(int i = 0; i < 4; i++){
			if(data[i] == data[i+1]){
				return true;
			}
		}
		return false;
	}

	private boolean istwo(int[] data) {
		int count = 0;
		for(int i = 0; i < 4; i++){
			if(data[i] == data[i + 1]){
				count++;
			}
		}
		if(count == 2) return true;
		return false;
	}

	private boolean isthree(int[] data) {
		int count = 0;
		int max = 0;
		for(int i = 0; i < 4; i++){
			if(data[i] == data[i + 1]){
				count++;
				max = Math.max(max, count);
			}
			else{
				count = 0;
			}
		}
		if(max == 2){
			return true;
		}
		return false;
	}

	private boolean isstraight(int[] data) {
		for(int i = 0; i < 4; i++){
			if(data[i] + 1 != data[i+1]){
				if(i == 0 &&  data[0] == 1 && data[4] == 13){
					
				}
				else{
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean isfull(int[] data) {
		if(data[0] == data[1] && data[1] == data[2] && data[3] == data[4]){
			return true;
		}
		if(data[0] == data[1] && data[2] == data[3] && data[3] == data[4]){
			return true;
		}
		return false;
	}

	private boolean isfour(int[] data) {
		int count = 0;
		int max = 0;
		for(int i = 0; i < 4; i++){
			if(data[i] == data[i + 1]){
				count++;
				max = Math.max(max, count);
			}
			else{
				count = 0;
			}
		}
		if(max == 3){
			return true;
		}
		return false;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}