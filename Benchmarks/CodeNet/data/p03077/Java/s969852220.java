import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long minMovePeople = Long.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
		    long current = sc.nextLong();
		    if (current < minMovePeople) { 
		        minMovePeople = current;
		    }
		}
		System.out.println(new Double(Math.floor(N / minMovePeople)).longValue() + 5);
	}
}