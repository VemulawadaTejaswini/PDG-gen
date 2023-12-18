import java.util.Scanner;
//int[] date=new int[2];
public class Main {
int i,o,sum,h,s,e,u,ty,yu,ui,n,num,qw;
String b,c,z,x,v,a,q;
Scanner scan =new Scanner(System.in);
//出力
	public void output() {
		sum=1;
h=scan.nextInt();
String[] date=new String[h];
	for(o=0;o<h;o++) {
		date[o]=scan.next();
	}
for(o=0;o<h;o++) {
	for(e=0;e<h;e++) {
		if(o!=e) {
			if(date[o].equals(date[e])) {
				
			}else {	
				s+=1;
			}
		}
	}
}
s/=4;
sum+=s;
System.out.println(sum);
		}
	public static void main(String [ ] args) {
		Main p = new  Main ();
		p.output();
		}
	}