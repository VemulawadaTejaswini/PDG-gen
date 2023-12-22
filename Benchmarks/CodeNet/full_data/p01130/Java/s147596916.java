import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1155().doIt();
    }
    class aoj1155{
    	int d(int n,int m,int s,int g1,int g2){
    		int cost[][] = new int [n][n];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					if(i == j)continue;
					cost[i][j] = Integer.MAX_VALUE/4;
				}
			}
			for(int i = 0;i < m;i++){
				int st = sc.nextInt()-1;
				int et = sc.nextInt()-1;
				int co = sc.nextInt();
				cost[st][et] = co;
			}
			for(int i=0; i<n;i++){
				for(int j=0; j<n;j++){
					for(int k=0; k<n;k++){
						cost[j][k]=Math.min(cost[j][k], cost[j][i]+cost[i][k]);
					}
				}
			}
            int ans = Integer.MAX_VALUE/4;
//            for(int i = 0;i < n;i++){
//            	for(int j = 0;j < n;j++){
//            		System.out.print(cost[i][j]+" ");
//            	}
//            	System.out.println();
//            }
            for(int i=0; i<n;i++)ans=Math.min(ans,cost[s][i]+cost[i][g1]+cost[i][g2]);
			return ans;
		}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			int m = sc.nextInt();
    			int s = sc.nextInt();
    			int g1 = sc.nextInt();
    			int g2 = sc.nextInt();
    			if(n+m+s+g1+g2 == 0)break;
    			System.out.println(d(n,m,s-1,g1-1,g2-1));
    		}
    	}
     }
}