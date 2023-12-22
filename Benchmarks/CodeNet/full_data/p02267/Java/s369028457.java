
import java.util.Scanner;

// implement the linear search
public class Main {
	
	public static int linear_search(int[] q, int x) {
		int i = 0;
		while(i < q.length) {
			if(q[i] == x) {
				return i;
			}
			i++;
		}
		
		
		return -1;
	}
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		
		int len = cin.nextInt();
		int [] q = new int[len];
		for(int i = 0; i < len; i++) {
			q[i] = cin.nextInt();
		}
		
		
		int count = 0;
		len = cin.nextInt();
		int x = 0;
		while(len > 0) {
			x = cin.nextInt();
			count += (linear_search(q, x) >= 0)? 1:0;
			len --;
		}
		
		
		System.out.println(count);
	}
	

}