import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int b=sc.nextInt();
			int r=sc.nextInt();
			int g=sc.nextInt();
			int c=sc.nextInt();
			int s=sc.nextInt();
			int t=sc.nextInt();
			if(b==0&&r==0&&g==0&&c==0&&s==0&&t==0)break;
			int m=100;
			m+=b*15+r*15+(b*5+r*3)*16+g*7+c*2-(t-s)*3;
			System.out.println(m);
		}
	}
}