import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double x = sc.nextDouble();
			double h = sc.nextDouble();
			if(x==0 && h==0)break;
			double c = Math.sqrt(h*h + (x/2)*(x/2));
			double ans = x*x + x*c/2*4;
			System.out.println(ans);
		}
	}
}