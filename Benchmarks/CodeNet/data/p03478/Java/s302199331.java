import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int a=0;
		for(int i=1;i<=N;i++) {
			int b=0;
			for(int k=i;k>0;) {
				b=k%10+b;
				k=k/10;
			}
			if((b>=A)&&(b<=B)){
				a=a+i;
			}
		}
		System.out.println(a);
	}
}