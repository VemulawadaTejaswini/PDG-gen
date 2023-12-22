import java.util.Scanner;

public class Main {
	
	public static void main(String arg[]){
		int _max = 100;
		Scanner scan = new Scanner(System.in);
		int[][] minTime;
		int n, a, b, c, minCost, sum, town, max; 
		while(scan.hasNext()){
			n = scan.nextInt();
			if(n==0) break;
			n++;
			minTime = new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++){
					if(i==j) minTime[i][j]=0;
					else minTime[i][j]=_max;
				}
			max = 0;
			
			for(int i=0;i<n-1;i++){
				a = scan.nextInt();
				b = scan.nextInt();
				c = scan.nextInt();
				minTime[a][b] = minTime[b][a] = c;
				max = Math.max(max, Math.max(a, b));
			}
			
			max++;
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					for(int k=0;k<n;k++)
						minTime[i][j] = Math.min(minTime[i][j],	minTime[i][k]+minTime[k][j]);

			minCost = _max;
			town = -1;
			for(int i=0;i<max;i++){
				sum = 0;
				for(int j=0;j<max;j++)
					sum += minTime[i][j];
				if(sum<minCost){
					town = i;
					minCost = sum;
				}
			}
			
			System.out.println(town+" "+minCost);
		}
	}

}