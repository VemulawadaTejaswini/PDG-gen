import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		int a,b;
		double x;
		a = n.nextInt();
		b = n.nextInt();
		x = (double)a/(double)b;
		System.out.println(a/b + " " + a%b + " " + x);
	}
}