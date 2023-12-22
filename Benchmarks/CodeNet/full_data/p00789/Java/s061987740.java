import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[300];
		int[] b = new int[300];
		Arrays.fill(a, 1);
		for(int i=2;i<=17;i++){
			for(int j=1;;j++){
				if(i*i*j>=300) break;
				for(int k=0;i*i*j+k<300;k++){
					b[i*i*j+k] += a[k];
				}
			}
			for(int j=0;j<300;j++) a[j] += b[j];
			Arrays.fill(b, 0);
		}
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			System.out.println(a[n]);
		}	
	}	
}