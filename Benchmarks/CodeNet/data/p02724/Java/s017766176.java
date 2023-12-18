import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long count = 0;
		long fifhund = X / 500;
		long fif = (X - 500 * fifhund) / 5;
		count = fifhund * 1000 + fif * 5;
		System.out.println(count); 
	}	
}