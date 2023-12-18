import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long tmp =n;
        int i=1;
        while(n-i*k>=0){
            tmp = n-k;
            i++;
        }
        n = Math.min(tmp,i*k-n);
        System.out.println(n);
	}
}