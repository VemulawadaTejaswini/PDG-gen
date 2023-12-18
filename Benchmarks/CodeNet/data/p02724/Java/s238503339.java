import java.util.*;
public class Main{
	public static final Scanner in =  new Scanner(System.in);
	public static void main(String args []){
		int n = in.nextInt();
		int a = n/500;
		int sum =0;
		sum+=a*1000;
		n=n%500;
		int b = n/5;
		sum+=b*5;
		System.out.print(sum);
		
	
		
	}
}
