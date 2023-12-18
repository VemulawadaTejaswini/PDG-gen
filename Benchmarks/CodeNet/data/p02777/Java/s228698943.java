//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int a=sc.nextInt();
		int b=sc.nextInt();
		String u=sc.next();
		if(s.equals(u))
			a-=1;
		else
			b-=1;
		System.out.println(a+" "+b);

	}

}
