import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong(); 
		long x = b-1;
		if(x>n){
			x = n;
		}
		long ans = (a*x)/b-a*(x/b);
		System.out.println(ans);

	}
}
