import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			LinkedList<Puzzle> oList = new LinkedList<Puzzle>();
			LinkedList<Puzzle> cList = new LinkedList<Puzzle>();
			int[] tmp = new int[8];
			int i0=-1;
			for(int i=0; i<8; i++){
				tmp[i] = in.nextInt();
				if(tmp[i]==0) 	i0=i;
			}
			oList.addFirst(new Puzzle(tmp, 0, i0));
			int n = -1;
			while((n=routine(oList, cList))==-1){}
			System.out.println(n);
		}
	}
	
	private static int routine(LinkedList<Puzzle> oList, LinkedList<Puzzle> cList){
		Puzzle p = oList.removeFirst();
		if(p.isGoal()){
			return p.g;
		}else{
			for(Puzzle pp : cList)	if(Arrays.equals(p.panel, pp.panel))	 return -1;
			int i0 = p.i0;	// 0の位置
			if(i0!=0 && i0!=4)	addNextPuzzle(i0,i0-1,p,oList);
			if(i0!=3 && i0!=7)	addNextPuzzle(i0,i0+1,p,oList);
			if(i0>3)			addNextPuzzle(i0,i0-4,p,oList);
			else				addNextPuzzle(i0,i0+4,p,oList);
			cList.addLast(p);
			return -1;
		}
	}
	
	private static void addNextPuzzle(int i, int j, Puzzle p, LinkedList<Puzzle> oList){
		int[] tmp = Arrays.copyOf(p.panel, 8);
		tmp[i] = tmp[j];
		tmp[j] = 0;
		Puzzle newP = new Puzzle(tmp, p.g+1, j);
		for(Puzzle pp : oList){
			if(newP.f <= pp.f){
				oList.add(oList.indexOf(pp), newP);
				return;
			}
		}
		oList.addLast(newP);
		return;
	}
}

class Puzzle {
	int[] panel;
	int g, f, i0;
	public Puzzle(int[] panel, int g, int i0) {
		this.panel = panel;
		this.g = g;
		this.i0 = i0;
		calcH();
	}
	public boolean isGoal(){
		if(Arrays.equals(panel, new int[]{0,1,2,3,4,5,6,7}))	return true;
		else													return false;
	}
	public void calcH(){
		int h=0;
		for(int i=0; i<8; i++){
			if(panel[i]!=0){
				h += Math.abs(panel[i]-i)/4 + Math.abs(panel[i]-i)%4;
			}
		}
		f = g+h;
		return;
	}
}