import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			boolean[] f = new boolean[1<<n];
			boolean[][] a = new boolean[n][n];
			int[] c = new int[n];
			
			int[][] b = new int[n][3];
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++) b[i][j] = sc.nextInt();
				c[i] = sc.nextInt() - 1;
				for(int j=i-1;j>=0;j--){
					if(Math.sqrt((b[i][0]-b[j][0])*(b[i][0]-b[j][0])+(b[i][1]-b[j][1])*(b[i][1]-b[j][1]))<b[i][2]+b[j][2]){
						a[i][j] = true;
					}
				}
			}
		
			f[(1<<n)-1] = true;
			int max = 0;
			boolean flag;
			int sum;
			for(int i=(1<<n)-1;i>=0;i--){
				sum = 0;
				if(f[i]==false) continue;
				for(int j=0;j<n;j++){
					if(((i>>j)&1)==0) sum++;
					if(((i>>j)&1)==0) continue;
					flag = false;
					for(int k=j-1;k>=0;k--){
						if(((i>>k)&1)==1 && a[j][k]==true){
							flag = true;
							break;
						}
					}
					if(flag==true) continue;
					for(int k=j+1;k<n;k++){
						if(((i>>j)&1)==0 || c[j]!=c[k]) continue;
						flag = false;
						for(int s=k-1;s>=0;s--){
							if(((i>>s)&1)==1 && a[k][s]==true){
								flag = true;
								break;
							}
						}
						if(flag==true) continue;
						f[i^(1<<j)^(1<<k)] = true;
					}
				}
				max = Math.max(max, sum);
			}
			System.out.println(max);
		}
	}	
}