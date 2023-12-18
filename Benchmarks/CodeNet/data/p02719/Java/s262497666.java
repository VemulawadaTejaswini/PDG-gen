import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
      	long x = 999999998;
      	long a = 999999999;
        //x = Math.abs(x-K);
      	while(a >= x){
        a = x;
        x = Math.abs(x-K);
        }
      	System.out.println(a);
	}
}