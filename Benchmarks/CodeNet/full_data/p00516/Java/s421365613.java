import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int cost[]=new int[n];//競技にかかる費用
		int ass[]=new int[m];//審査員の評価基準
		int cnt[]=new int[n];//票数
		int best,index=0;
		
		for(int i=0;i<n;i++){
			cost[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			ass[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(ass[i]>=cost[j]){
					cnt[j]++;
					break;
				}
			}
			
		}
		best=cnt[0];
		for(int i=1;i<n;i++){
			if(best<cnt[i]){
				best=cnt[i];
				index=i;
			}
		}
		
		System.out.println(index+1);
		
	}

}