import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=0;
		String[] s = new String[100];
		while(sc.hasNext()){
			s[n] = sc.next();
			n++;
		}
		
		int[][] map = new int[n][n];
		int[][] cost = new int[n][n];
		
		for(int i=0;i<n;i++){
			int z;
			if(i<=n/2){
				z=i;
			}else{
				z=n-i-1;
			}
			
			int sum = 0;
			int count = 0;
			int start = 0;
			for(int j=0;j<z;j++){
				start = count;
				while(s[i].substring(count,count+1).compareTo(",")!=0)count++;
				map[i][j] = Integer.valueOf(s[i].substring(start,count));
				count++;
			}
			map[i][z] = Integer.valueOf(s[i].substring(count,s[i].length()));		
		}
		
		cost[0][0] = map[0][0];
		
		for(int j=1;j<n;j++){
			int z, flag;
			if(j<=n/2){
				z=j;
				flag=1;
			}else{
				z=n-j-1;
				flag=-1;
			}
			
			for(int k=0;k<=z;k++){
				if(k==0 && flag==1){
					cost[j][k] = cost[j-1][k]+map[j][k];
				}else if(cost[j-1][k]>cost[j-1][k-1*flag]){
					cost[j][k] = cost[j-1][k]+map[j][k];
				}else{
					cost[j][k] = cost[j-1][k-1*flag]+map[j][k];
				}
			}
		}
		
		System.out.print(cost[n-1][0]);

	}
}