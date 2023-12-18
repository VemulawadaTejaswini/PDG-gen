import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int q=sc.nextInt();
		double div=0;
		int c=0;
		for(int i=0;i<q;i++) {
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double ab=a*b;
			double A=Math.ceil(ab/(b+1)-1);
			double B=Math.ceil(ab/(a+1)-1);
			c=0;
			div=0;
			while(A>=1) {
				c++;
				div=Math.ceil(ab/A)-1;
				A=Math.ceil(ab/(div+1)-1);
			}
			while(B>=1) {
				c++;
				div=Math.ceil(ab/B)-1;
				B=Math.ceil(ab/(div+1)-1);
			}
			System.out.println(c);
//			System.out.println((int)(Math.ceil(a*b/(a+1))+Math.ceil(a*b/(b+1))-2));
//			System.out.println(a*b/(a+1));
//			System.out.println(a*b/(b+1));
		}
	}

}
