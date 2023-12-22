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
	int[] date=new int[4];
	for(o=0;o<4;o++) {
		date[o]=scan.nextInt();
	}
while(true) {
	date[2]-=date[1];
	if(date[2]<=0) {
		System.out.println("Yes");
		break;
	}else {
		date[0]-=date[3];
	}
	if(date[0]<=0) {
		System.out.println("No");
		break;
	}
}
		}
	public static void main(String [ ] args) {
		Main p = new  Main ();
		p.input();
		p.compute();
		p.output();
		}
	}