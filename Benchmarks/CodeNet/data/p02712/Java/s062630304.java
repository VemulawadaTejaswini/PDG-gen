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
int[] date=new int[h];
for(o=0;o<h;o++) {
	i=o+1;
	date[o]=i;
	if(date[o]/3==0) {
		date[o]=0;
	}else if(date[o]/5==0) {
		date[o]=0;
	}
	e+=date[o];
}
System.out.println(e);
}
	public static void main(String [ ] args) {
		 Main p = new  Main ();
		p.input();
		p.compute();
		p.output();
		}
	}