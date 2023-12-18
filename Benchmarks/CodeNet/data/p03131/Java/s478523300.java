import java.util.*;
public class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		long k=s.nextInt(),a=s.nextInt(),b=s.nextInt(),c=k-a+1;
		System.out.println(Math.max(k+1,a+c/2*(b-a)+c%2));
	}
}