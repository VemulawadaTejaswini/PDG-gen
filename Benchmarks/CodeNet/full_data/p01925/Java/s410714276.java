import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0){
				return;
			}
			long[][] score = new long[2][n];
			for(int i = 0;i < m;i++){
				int s = sc.nextInt();
				int k = sc.nextInt();
				int[] c = new int[k];	
				for(int j = 0;j < k;j++){
					c[j] = sc.nextInt()-1;
					score[0][c[j]] += s;
				}
				if(k == 1) {
					score[1][c[0]] += s;
				}
			}
			long max = 0;
			int maxIndex = 0;
			long max2 = 0;
			int maxIndex2 = 0;
			for(int i = 0;i < n;i++){
				if(score[0][i] >= max){
					max = score[0][i];
					maxIndex = i;
				}
			}
			for(int i = 0;i < n;i++){
				if(i == maxIndex){
					continue;
				}
				if(score[0][i] >= max2){
					max2 = score[0][i];
					maxIndex2 = i;
				}
			}
			long min = Long.MAX_VALUE;
			int minIndex = 0;
			long min2 = Long.MAX_VALUE;
			int minIndex2 = 0;
			for(int i = 0;i < n;i++){
				if(score[1][i] <= min){
					min = score[1][i];
					minIndex = i;
				}
			}
			for(int i = 0;i < n;i++){
				if(i == minIndex){
					continue;
				}
				if(score[1][i] <= min2){
					min2= score[1][i];
					minIndex2 = i;
				}
			}
			long ans = 0;
			if(minIndex == maxIndex){
				ans = max2 - min+1;
				ans = Math.max(ans,max - min2+1);	
				System.out.println(ans);
				continue;
			}
			ans = max - min +1;
			System.out.println(ans);
		}
	}
}

