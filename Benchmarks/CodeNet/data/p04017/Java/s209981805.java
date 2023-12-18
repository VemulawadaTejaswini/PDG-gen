
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		int l = s.nextInt();
		int q = s.nextInt();
		for (int i = 0; i < q; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(f(num,a-1,b-1,l));
		}
		
		
	}
	
	public static int f(int[] num, int a, int b, int l) {
		int cost = 0;
		int min = num[a];
		if (a < b)
			for (int i = a + 1; i <= b; i++) {
				if(num[i]-min>l)
				{
					cost++;
					min=num[i-1];
					//System.out.print(i-1+" ");
				}
			}
		else {
			for (int i = a - 1; i >= b; i--) {
				if(min-num[i]>l) {
					cost++;
					min = num[i + 1];
					//System.out.print(i + 1 + " ");
				}
			}
		}
		return cost+1;
		
	}
}
