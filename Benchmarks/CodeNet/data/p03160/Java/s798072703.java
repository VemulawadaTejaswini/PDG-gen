import java.uti.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int N = s.nextInt();
	    int[] h = new int[N];
	    for(int i = 0; i < N; i++) h[i] = s.nextInt();
	    System.out.println(calculateCost(h));
	}
	
	private static int calculateCost(int[] h) {
	    int cost[] = new int[h.length]; //cost[0] = h[0];
	    cost[1] = Math.abs(h[1] - h[0]); // 0, 20 
	    for(int i = 2; i < cost.length; i++) {
	        
	        int p1 = Math.abs(h[i - 1] - h[i]), p2 = Math.abs(h[i - 2] - h[i]);
	        cost[i] = (p1 < p2 ? (p1 + cost[i - 1]) : (cost[i - 2] + p2));
	    }
	    return cost[h.length - 1];
	}
}