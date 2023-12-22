import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] ar = new long[n];
		long min = 0;
		long tmp = 0;
		
		ar[0] = s.nextLong();
				
		for(int i = 1; i < n; i++) {
			
			tmp = s.nextLong();
			
			if(tmp < ar[i-1])
				min += ar[i-1] - tmp;
			
			ar[i] = Math.max(ar[i-1], tmp);
			
		}
		
		
		System.out.println(min);
		

	}

}