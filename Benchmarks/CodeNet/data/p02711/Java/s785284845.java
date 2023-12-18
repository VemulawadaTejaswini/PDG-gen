import java.util.Scanner;
//int[] date=new int[2];
public class Main {
int i,o,sum,h,s,e,u,ty,yu,ui,n,num,qw;
double m,t,r,j,k,f,d,g,w;
static double l;
String b,c,z,x,v,a,q;
Scanner scan =new Scanner(System.in);
//入力
	public void input() {	
	
	}
	//演算
	public void compute() {
	
		}
//出力
public void output() {
h=scan.nextInt();
if(h/100!=7) {
	o=h/10;
	if(o%10!=7) {
		if(h%10!=7) {
			System.out.println("No");
		}
	}
}else {
	System.out.println("Yes");
}
}
	public static void main(String [ ] args) {
		 Main p = new  Main ();
		p.input();
		p.compute();
		p.output();
		}
	}