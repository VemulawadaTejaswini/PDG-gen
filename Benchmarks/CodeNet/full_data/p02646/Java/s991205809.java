import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();
		
		long D = Math.abs(B-A);
		long S = V-W;
		
        if(S*T < D) {System.out.println("NO");}
		else {System.out.println("YES");}
	}
}
