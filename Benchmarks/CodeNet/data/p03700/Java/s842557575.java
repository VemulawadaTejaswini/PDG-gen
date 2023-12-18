import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] hps = new int[n];
		
		for(int i=0; i<hps.length; i++) {
			hps[i] = sc.nextInt();
		}
		sc.close();
		
		int count = 0;
		
		Arrays.sort(hps);;
		
		
		while(hps[n-1]>0) {
			for(int i=0; i<hps.length; i++) {
				hps[i] -= b;
			}
			hps[n-1] -= a-b;
			
			Arrays.sort(hps);
			count += 1;
		}
		
		System.out.print(count);
		
		

	}

}
