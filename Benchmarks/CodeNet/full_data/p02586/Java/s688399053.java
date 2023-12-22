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
            if(item[i][j]==0){ans[i][j][0]=Math.max(ans[i][j-1][0],ans[i-1][j][3]);            
            for(int l=1;l<=3;l++){ans[i][j][l]=ans[i][j-1][l];}
            }
            else{ans[i][j][0]=Math.max(ans[i][j-1][0],ans[i-1][j][3]);
              for(int l=1;l<=3;l++){ans[i][j][l]=Math.max(ans[i][j-1][l],Math.max(ans[i][j][l-1],ans[i][j-1][l-1]+item[i][j]));}           
                }                                  
          } 
        }      
		System.out.println(ans[r][c][3]);
	}
}