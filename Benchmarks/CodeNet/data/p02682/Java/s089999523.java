import java.util.Scanner;
public class Main{
	int o,h,s,e;
	double q,w,a;
	String  i,l,k;
	Scanner scan=new Scanner(System.in);
	public void output() {
int[] date=new int[4];
for(o=0;o<4;o++) {
	date[o]=scan.nextInt();
}
while(date[3]!=0) {
	date[3]-=1;
	if(date[0]!=0) {
		h+=1;
		date[0]-=1;
	}else if(date[1]!=0) {
		h+=0;
		date[1]-=1;
	}else if(date[2]!=0) {
		h-=1;
		date[2]-=1;
	}
	
}
System.out.println(h);
	}
	public static void main(String[] args) {
		Main p=new Main();
		p.output();
	}
}