import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
		long [][] item = new long [r+1][c+1];
        long [][][] ans = new long [r+1][c+1][4];
        for(int i=0;i<k;i++){int R = sc.nextInt();
                             int C = sc.nextInt();
                             long K = sc.nextLong();
                             item[R][C]=K;
                            }		
        for(int i=1;i<=r;i++){                              
          for(int j=1;j<=c;j++){                               
            if(item[i][j]==0){                                
              ans[i][j][0]=Math.max(ans[i][j-1][0],Math.max(ans[i-1][j][0],Math.max(ans[i-1][j][1],Math.max(ans[i-1][j][2],ans[i-1][j][3]))));            
            for(int k=1;k<=3;k++){ans[i][j][k]=ans[i][j-1][k];}
            }
            else{ans[i][j][0]=Math.max(ans[i][j-1][0],Math.max(ans[i-1][j][0],Math.max(ans[i-1][j][1],Math.max(ans[i-1][j][2],ans[i-1][j][3]))));
              for(int k=1;k<=3;k++){ans[i][j][k]=Math.max(ans[i][j-1][k],ans[i][j-1][k-1]+item[i][j];}           
                }                                  
          } 
        }      
		System.out.println(Math.max(ans[r][c][0],Math.max(ans[r][c][1],Math.max(ans[r][c][2],ans[r][c][3]))));
	}
}