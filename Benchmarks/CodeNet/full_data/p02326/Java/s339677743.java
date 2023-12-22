import java.util.Random;
import java.util.Scanner;
 
public class Main {
    static int h,w;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        h = scan.nextInt();
        w = scan.nextInt();
        int result=0;
        int[][] d = new int[h][w];
        int[][] dp = new int[h][w];
        for(int i=0;i<h;++i){
            for(int j=0;j<w;++j){
d[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<w;++i){
            if(d[0][i]==1){
                dp[0][i]=0;
            } else {
                dp[0][i]=1;
            }
        }
        for(int i=0;i<h;++i){
            if(d[i][0]==1){
                dp[i][0]=0;
            } else {
                dp[i][0]=1;
            }
        }
        result=cheak(d,dp,0);

        System.out.println(result*result);
    }
 
    public static int cheak(int[][] d, int [][] dp,int result){
int flag=0;
		if(h==1&&w==1){
			if(d[0][0]==1){
				flag=0;
			} else {
				flag=1;
			}
		}
        for(int i=1;i<h;++i){
            for(int j=1;j<w;++j){
                if(d[i][j]==1){
                    dp[i][j]=0;
                } else {
					flag=1;
                    int num=dp[i-1][j-1];
                    if(num>dp[i-1][j]){
                        num=dp[i-1][j];
                    }
                    if(num>dp[i][j-1]){
                        num=dp[i][j-1];
                    }
                    dp[i][j]=num+1;
                }
                if(result<dp[i][j]){
                    result=dp[i][j];
                }
            }
        }
		if(result==0){
			result=1;
			if(flag!=1){
				result=0;
			}
		}
        return result;
    }
}