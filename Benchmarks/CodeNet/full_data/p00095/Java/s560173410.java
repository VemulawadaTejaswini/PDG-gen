import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] v = new int[n];
			int[] w = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				v[i] = sc.nextInt();
			}
			
			w = Arrays.copyOf(v, n);
			Arrays.sort(w);
			int min = Integer.MAX_VALUE;
			
			for(int i=0;i<n;i++){
				if(v[i]==w[n-1]){
					min = Math.min(min, a[i]);
				}
			}
			
			System.out.println(min + " " + w[n-1]);
		}
	}	
}