

import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] N = new int[6];
		for(int i=0;i<6;i++)N[i]=Integer.parseInt(sc.next());
		Dice dice1 = new Dice(N);
		for(int i=0;i<6;i++)N[i]=Integer.parseInt(sc.next());
		Dice dice2 = new Dice(N);
		//String order = sc.next();
		//char[] charOrder = order.toCharArray();
		
		
		
			System.out.println(dice1.equals(dice2)?"Yes":"No");
		
		sc.close();
	}

}

class Dice{
	private int[] roll=new int[6];
	private int[] nowRoll= new int[6];
	Dice(int[] N){
		for(int i = 0;i<6;i++){
			this.roll[i]=N[i];
			this.nowRoll[i]=N[i];
		}
	}

	public int getRoll(int i){
		return nowRoll[i];
	}

	public void roll(char c){
		//int dir;
		int[] tmpRoll=new int[6];
		for(int i=0;i<6;i++)tmpRoll[i]=this.nowRoll[i];
		int[][] mapRoll={{3,1,0,5,4,2},{1,5,2,3,0,4},{4,0,2,3,5,1},{2,1,5,0,4,3},{0,2,4,1,3,5},{0,3,1,4,2,5},{5,1,3,2,4,0}};
		int dir=0;
		if(c=='E') dir=0;
		if(c=='N') dir=1;
		if(c=='S') dir=2;
		if(c=='W') dir=3;
		if(c=='R') dir=4;
		if(c=='L') dir=5;
		if(c=='X') dir=6;
		
		for(int i=0;i<6;i++)this.nowRoll[i]=tmpRoll[mapRoll[dir][i]];
	}
	public int getRightRoll(int roll,int front){
		int[][] a={{-1,2,4,1,3,-1},{3,-1,0,5,-1,2},{1,5,-1,-1,0,4},{4,0,-1,-1,5,1},{2,-1,5,0,-1,3},{-1,3,1,4,2,-1}};
		int r=a[roll][front];
		return this.nowRoll[r];
	}
	public boolean equals(Dice d){
		int[] N= new int[6];
		for(int i=0;i<6;i++) N[i]=d.getRoll(i);
		Dice d1 = new Dice(N);
		boolean bool=false;
		
		for(char c: "RRRERRRERRREERRRWRRRWRRRX".toCharArray()){
			boolean eachBool=true;
			for(int i=0;i<6;i++) eachBool=eachBool&&(this.getRoll(i)==d1.getRoll(i));
			d1.roll(c);
			bool=bool||eachBool;
		}	
		//for(int i=0;i<6;i++)System.out.println(d1.getRoll(i));
		return bool;
	}
}