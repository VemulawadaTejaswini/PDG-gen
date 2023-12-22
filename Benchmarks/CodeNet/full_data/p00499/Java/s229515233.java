import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int j, m;
		j = (int)Math.ceil((double)(a / c));
		m = (int)Math.ceil((double)(b / d));
		if(j > m) System.out.println(j);
		else System.out.println(m);
	}

}