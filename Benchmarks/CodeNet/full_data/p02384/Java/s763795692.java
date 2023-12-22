import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//PrintWriter out=new PrintWriter(System.out);
		Dice D=new Dice();
		List<Integer> dice=new ArrayList<>();
		for(int i=0;i<6;i++)dice.add(in.nextInt());
		
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			D.setTop(dice.indexOf(in.nextInt())+1);
			System.out.println(dice.get(D.getR(dice.indexOf(in.nextInt())+1)-1));
		}
		
		
		//out.flush();
	}
}

class Dice{
	static List<Integer> side=new ArrayList<>(Arrays.asList(1,3,6,4)),
			vert=new ArrayList<>(Arrays.asList(1,5,6,2)),
			lr=new ArrayList<>(Arrays.asList(2,3,5,4));
	
	static void turn(char dist) {
		switch(dist) {
		case 'N':
			int topn=vert.remove(3);
			vert.add(0, topn);
			side.set(0, vert.get(0)); side.set(2, vert.get(2));
			lr.set(0, vert.get(3)); lr.set(2, vert.get(1));
			//System.out.println(side+" "+vert+" "+lr);
			break;
			
		case 'E':
			int tope=side.remove(3);
			side.add(0, tope);
			vert.set(0, side.get(0)); vert.set(2, side.get(2));
			lr.set(1, side.get(1)); lr.set(3, side.get(3));
			//System.out.println(side+" "+vert+" "+lr);
			break;
		
		case 'S':
			int tops=vert.remove(0);
			vert.add(tops);
			side.set(0, vert.get(0)); side.set(2, vert.get(2));
			lr.set(0, vert.get(3)); lr.set(2, vert.get(1));
			//System.out.println(side+" "+vert+" "+lr);
			break;
			
		case 'W':
			int topw=side.remove(0);
			side.add(topw);
			vert.set(0, side.get(0)); vert.set(2, side.get(2));
			lr.set(1, side.get(1)); lr.set(3, side.get(3));
			//System.out.println(side+" "+vert+" "+lr);
			break;
			
		case 'L':
			int frontl=lr.remove(0);
			lr.add(frontl);
			vert.set(1, lr.get(2)); vert.set(3,lr.get(0));
			side.set(1, lr.get(1)); side.set(3, lr.get(3));
			//System.out.println(side+" "+vert+" "+lr);
			break;
			
		case 'R':
			int frontr=lr.remove(3);
			lr.add(0,frontr);
			vert.set(1, lr.get(2)); vert.set(3,lr.get(0));
			side.set(1, lr.get(1)); side.set(3, lr.get(3));
			//System.out.println(side+" "+vert+" "+lr);
			break;
		}	
	}
	
	static void setTop(int odr) {
		if(odr==vert.get(0))return;
		else if(odr==vert.get(2)) {
			for(int i=0;i<2;i++)turn('N');
		}
		else {
			char dir[]= {'N','W','S','E'};
			for(int i=0;i<4;i++) {
				if(odr==lr.get(i)) {
					turn(dir[i]);
					break;
				}
			}
		}
	}
	
	static int getR(int front) {
		int res=-1;
		for(int i=0;i<4;i++) {
			if(front==lr.get(i)) {
				res=lr.get((i+1)%4);
				break;
			}
		}
		//System.out.println(res);
		return res;
	}
}

