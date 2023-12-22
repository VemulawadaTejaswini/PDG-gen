import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//PrintWriter out=new PrintWriter(System.out);
		Dice D1=new Dice(),D2=new Dice();
		for(int i=0;i<6;i++)D1.dice.add(in.nextInt());
		for(int i=0;i<6;i++)D2.dice.add(in.nextInt());
		
		if(checkDices(D1,D2))System.out.println("Yes");
		else System.out.println("No");
	}
	
	static boolean checkDices(Dice D1,Dice D2) {
		//check top
		for(int i=0;i<6;i++) {
			D1.setTop(i+1);
			int j;
			for(j=0;j<6;j++) {
				if(D1.dice.get(D1.vert.get(0)-1)==D2.dice.get(j)) {
					D2.setTop(j+1);
					break;
				}
			}
			if(j==6)return false;
			//System.out.println(D1.dice.indexOf(D1.lr.get(0)-1)+1);
			D2.setFront(D2.dice.indexOf(D1.dice.get(D1.lr.get(0)-1))+1);
			
			int same=0;
			for(int k=0;k<4;k++) {
				if(D1.dice.get(D1.lr.get(k)-1)==D2.dice.get(D2.lr.get(k)-1))same++;
			}
			if(same==4 && D1.dice.get(D1.vert.get(2)-1)==D2.dice.get(D2.vert.get(2)-1))return true;
		}
		return false;
	}
}


class Dice{
	List<Integer> side=new ArrayList<>(Arrays.asList(1,3,6,4)),
			vert=new ArrayList<>(Arrays.asList(1,5,6,2)),
			lr=new ArrayList<>(Arrays.asList(2,3,5,4)),
			dice=new ArrayList<>();
	
	void turn(char dist) {
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
	
	boolean setTop(int odrIndex) {
		if(odrIndex==vert.get(0))return true;
		else if(odrIndex==vert.get(2)) {
			for(int i=0;i<2;i++)turn('N');
		}
		else {
			char dir[]= {'N','W','S','E'};
			int i;
			for(i=0;i<4;i++) {
				if(odrIndex==lr.get(i)) {
					turn(dir[i]);
					break;
				}
			}
			if(i<4)return true;
		}
		return false;
	}
	
	void setFront(int odrIndex) {
		for(int i=0;i<4;i++) {
			if(odrIndex==lr.get(i)) {
				for(int j=0;j<i;j++)turn('L');
				break;
			}
		}
	}
	
	int getR(int front) {
		int res=-1;
		for(int i=0;i<4;i++) {
			if(front==lr.get(i)) {
				res=lr.get((i+1)%4);
				break;
			}
		}
		//System.out.println(res);
		return dice.get(res-1);
	}
}

