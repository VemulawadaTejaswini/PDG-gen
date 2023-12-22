import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int[] a = new int[n+2];
			for(int i=1;i<=n;i++) a[i] = sc.nextInt();
			a[0] = 4;
			a[n] = 5;
			
			int max = 0;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=3;j++){
					if(a[i]!=j){
						int p = i+1;
						int q = i-1;
						int r = j;
						int sum = 0;
						while(true){
							while(p<=n && a[p]==r) p++;
							while(q>0 && a[q]==r) q--;
							if(p-q-1<4){
								max = Math.max(max, sum);
								break;
							}
							sum = p-q-1;
							
							if(a[p]!=a[q]){
								max = Math.max(max, sum);
								break;
							}
							r = a[p];
						}
					}
				}
			}
			System.out.println(n-max);
		}
	}

}