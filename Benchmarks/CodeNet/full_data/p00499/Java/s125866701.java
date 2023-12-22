import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double d = sc.nextInt();
		int j, m;
		j = (int)Math.ceil(a / c);
		m = (int)Math.ceil(b / d);
		if(j > m) System.out.println(l - j);
		else System.out.println(l - m);
	}

}