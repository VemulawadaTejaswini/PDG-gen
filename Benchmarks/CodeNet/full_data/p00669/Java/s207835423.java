import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n==0 && k==0) break;
			int[] a = new int[n];
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			
			int max = 0;
			int temp = 1;
			for(int p=0;p<=n-k;p++){
				temp = 1;
				for(int q=0;q<k;q++) temp *= a[p+q];
				max = Math.max(max, temp);
			}
			int maxorigin = max;
			
			int maxmax = 0;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					max = 0;
					for(int p=0;p<=n-k;p++){
						temp = 1;
						for(int q=0;q<k;q++) temp *= a[p+q];
						max = Math.max(max, temp);
					}
					maxmax = Math.max(maxmax, max);
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;	
				}
			}
			
			System.out.println(maxmax-maxorigin);
		}
	}

}