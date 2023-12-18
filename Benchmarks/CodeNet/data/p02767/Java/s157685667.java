import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X =0;
      	int min = 0;
		int health = 0;
		int max_value = Integer.MAX_VALUE;
		for(int i=1; i<=N; i++) {
			X = sc.nextInt();
			health = (X-i)*(X-i);
			min += Math.min(health,max_value);
		}
		System.out.println(min);
	}		
}