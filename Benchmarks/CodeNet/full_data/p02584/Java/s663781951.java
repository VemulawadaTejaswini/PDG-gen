import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong(),k=sc.nextLong(),d=sc.nextLong();
		long r=0;
		if(x<0)
		{
			r=x/d;
			if(r>k) r=k;
			System.out.println(Math.abs(x+r*d));
		}
		else
		{
			r=x/d;
			if(r>k) r=k;
			System.out.println(Math.abs(x-r*d));
		}
	}
}