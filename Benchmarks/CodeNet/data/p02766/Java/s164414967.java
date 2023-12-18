//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int c=0;
		while(n!=0)
		{
			n/=k;
			c++;
		}
		System.out.println(c);

	}

}
