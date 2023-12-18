import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=0;
		if(a>c)
			System.out.println("0");
		else{
		if(c%a>1)
			d=b*(c/a)+b;
		else d=b*(c/a);
		System.out.println(d);
		}
	}
}