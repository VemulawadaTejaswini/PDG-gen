import java.util.Scanner;
class Dice{
	int A,S,D,F,G,H,Z;
	Dice(int a,int s,int d,int f,int g,int h){
		A=a;S=s;D=d;F=f;G=g;H=h;
	}
	void turnN() {
		Z=A;
		A=S;S=H;H=G;G=Z;
	}
	void turnS() {
		Z=A;
		A=G;G=H;H=S;S=Z;
	}
	void turnW() {
		Z=A;
		A=D;D=H;H=F;F=Z;
	}
	void turnE() {
		Z=A;
		A=F;F=H;H=D;D=Z;
	}
	void turnright() {
		Z=S;
		S=F;F=G;G=D;D=Z;
	}
	void turnleft() {
		Z=S;
		S=D;D=G;G=F;F=Z;
	}
}
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Dice d=new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		char [] ch=sc.next().toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='N')d.turnN();
			else if(ch[i]=='S')d.turnS();
			else if(ch[i]=='E')d.turnE();
			else if(ch[i]=='W')d.turnW();
		}
		System.out.println(d.A);
		sc.close();
	}
}

