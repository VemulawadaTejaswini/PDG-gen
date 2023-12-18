import java.util.*;

public class Main {
		public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   int N = sc.nextInt();
	   Integer d[] = new Integer[N];
		for (int i=0; i<N; i++) {
			d[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i == j) {
					continue;
				}
				sum +=  d[i] * d[j];
		}
	   }
          System.out.println(sum / 2);
}
}

