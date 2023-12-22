import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int a,b,c,s,p1,p2;
			if(n==0) break;
			if(n!=1000){
				a=n/100;
				n%=100;
				b=n/10;
				c=n%10;
				s=a+b+c;
				System.out.println(s);
			}else if (n==1000){
				System.out.println("1");
			}
		}
	}
}