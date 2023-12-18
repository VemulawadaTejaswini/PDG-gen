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
			double A=Math.ceil(a/(b+1)*b-1);
			double B=Math.ceil(a/(a+1)*b-1);
			c=0;
			div=Math.ceil(a/A*b)-1;

			while(A>=div) {
				c++;
				A=Math.ceil(a/(div+1)*b-1);
				div=Math.ceil(a/A*b)-1;
			}
			c+=A;
			div=Math.ceil(a/B*b)-1;
			while(B>=div) {
				c++;
				B=Math.ceil(a/(div+1)*b-1);
				div=Math.ceil(a/B*b)-1;
			}
			c+=B;
			System.out.println(c);
		}
	}

}
