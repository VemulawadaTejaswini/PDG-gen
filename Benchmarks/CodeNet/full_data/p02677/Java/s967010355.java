//20200517 C
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double h=sc.nextInt();
		double m=sc.nextInt();
		double c=Math.cos(Math.toRadians(30*h+m/2-6*m));
		System.out.println(Math.sqrt(a*a+b*b-2*a*b*c));
	}
}
