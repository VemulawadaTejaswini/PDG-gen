import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long t=(c-1)/b+1;
		long o=(a-1)/d+1;
		if(t<=o){
		System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}