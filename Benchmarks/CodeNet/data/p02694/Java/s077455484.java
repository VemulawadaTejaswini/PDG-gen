import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long X = sc.nextLong();
		long total = 100;
		int a = 0;
		while (total<X) {
		    total *= 1.01;
		    a++;
		}
		
		System.out.println(a);
    }
}