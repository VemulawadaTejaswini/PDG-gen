import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Puzzle> oList = new ArrayList<Puzzle>();
		ArrayList<Puzzle> cList = new ArrayList<Puzzle>();
		oList.add(new Puzzle(1234567, 0, 0));
		routine(oList, cList);
		
		Scanner in = new Scanner(System.in);
		int input, g;
		while(in.hasNext()){
			input = 0;	g = -1;
			for(int i=0; i<8; i++)	input = input*10 + in.nextInt();
			for(Puzzle pp : cList){
				if(input == pp.panel){
					g = pp.g;
					break;
				}
			}
			System.out.println(g);
		}
	}
	
	private static void routine(ArrayList<Puzzle> oList, ArrayList<Puzzle> cList){
		roop: while(!oList.isEmpty()){
			Puzzle p = oList.remove(0);
			for(Puzzle pp : cList)	if(p.panel == pp.panel)	continue roop;
			
			int i0 = p.i0;	// 0の位置
			if(i0!=0 && i0!=4)	addNextPuzzle(i0,i0-1,p,oList);
			if(i0!=3 && i0!=7)	addNextPuzzle(i0,i0+1,p,oList);
			if(i0>3)	addNextPuzzle(i0,i0-4,p,oList);		else	addNextPuzzle(i0,i0+4,p,oList);
			cList.add(p);
		}
	}
	
	private static void addNextPuzzle(int i, int j, Puzzle p, ArrayList<Puzzle> oList){
		int tmp = p.panel;
		int a, b, num;
		int[] place = {10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};
		a = place[i];
		b = place[j];
		num = (tmp/b)%10;
		
		tmp = tmp - num*b + num*a;
		Puzzle newP = new Puzzle(tmp, p.g+1, j);
		oList.add(newP);
		return;
	}
	
	
	static class Puzzle {
		int panel;
		int g, i0;
		public Puzzle(int panel, int g, int i0) {
			this.panel = panel;
			this.g = g;
			this.i0 = i0;
		}
	}
}