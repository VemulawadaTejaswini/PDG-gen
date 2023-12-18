import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		
		int d=3;
		if(a==b)
			d--;
		if(a==c)
			d--;
		if(c==d)
			d--;
		System.out.println(d);
		
		
	}
}