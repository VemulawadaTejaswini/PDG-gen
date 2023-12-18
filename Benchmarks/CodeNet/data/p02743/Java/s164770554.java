import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		if((-a-b+c)*(-a-b+c)>4*a*b){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
