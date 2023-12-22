import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int f=sc.nextInt();
			double x=((double)(c*e-b*f))/((double)(a*e-b*d));
			double y=((double)(c*d-a*f))/((double)(b*d-a*e));
			System.out.printf("%.3f %.3f\n", x,y);
		}
	}
}