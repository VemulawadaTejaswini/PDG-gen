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
		sum=1;
h=scan.nextInt();
String[] date=new String[h];
	for(o=0;o<h;o++) {
		date[o]=scan.next();
	}
u=1;
sum=1;
	for(o=0;o<h-1;o++){	
		
      for(e=u;e<h;e++){
			if(date[o].equals(date[e])) {
				
			}else {	
				s+=1;
			
			}
      }
      u+=1;
    }
	s/=2;
	sum+=s;
System.out.println(sum);
		}
	public static void main(String [ ] args) {
		Main p = new  Main ();
		p.input();
		p.compute();
		p.output();
		}
	}