import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long X = sc.nextLong();
		long total = 100;
		long year = 0;
		while (X > total) {
		    total *= 1.01;
		    year++;
		}
		
		System.out.println(year);
    }
}