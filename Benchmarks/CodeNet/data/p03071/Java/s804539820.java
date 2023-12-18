import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = Math.max(a+b, Math.max(2*a-1, 2*b-1));
		System.out.println(res);
	}
}