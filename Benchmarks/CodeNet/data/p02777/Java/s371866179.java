import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next(),T=sc.next();
		int a=sc.nextInt(),b=sc.nextInt();
		String U = sc.next();
		if(U.equals(S)) {
			a--;
		}
		else if(U.equals(T))
			b--;
		System.out.println(a+" "+b);
	}
}
