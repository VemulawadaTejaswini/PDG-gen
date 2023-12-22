import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int f=sc.nextInt();
			double y=(c*d-a*f)/(b*d-a*e);
			double x=(c-b*y)/a;
			System.out.printf("%.3f %.3f\n",x,y);
		}
	}
}