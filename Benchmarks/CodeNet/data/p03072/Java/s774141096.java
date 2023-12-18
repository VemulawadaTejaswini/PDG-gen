import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] mt = new int[n];
		
		for(int i=0;i<n;i++) {
			mt[i] = Integer.parseInt(sc.next());
			
		}
		
		int count = 1;
		int max = mt[0];
		for(int i=1;i<n;i++) {
			if(mt[i]>max) {
				count++;
				max = mt[i];
			}else if(mt[i] == max) {
				count++;
			}
			
			
			
		}
		
		System.out.println(count);
	}
}
