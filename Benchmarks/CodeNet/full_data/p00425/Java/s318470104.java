import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int x,r;
		Dice d=new Dice();
		while((x=s.nextInt())!=0) {
			d.reset();
			r=1;
			for(int i=0;i<x;i++) {
				d.turn(s.next());
				r+=d.u;
			}
			System.out.println(r);
		}
	}
}
class Dice{
	int n,e,w,s,u,d;
	Dice() {
	}
	void turn(String str){
		int b;
		switch (str) {
		case "North":
			b=u;
			u=s;
			s=d;
			d=n;
			n=b;
			break;
		case "South":
			b=u;
			u=n;
			n=d;
			d=s;
			s=b;
			break;
		case "East":
			b=u;
			u=w;
			w=d;
			d=e;
			e=b;
			break;
		case "West":
			b=u;
			u=e;
			e=d;
			d=w;
			w=b;
			break;
		case "Right":
			b=n;
			n=w;
			w=s;
			s=e;
			e=b;
			break;
		case "Left":
			b=n;
			n=e;
			e=s;
			s=w;
			w=b;
			break;
		}
	}
	void reset() {
		n=5;
		e=3;
		w=4;
		s=2;
		u=1;
		d=6;
	}
}