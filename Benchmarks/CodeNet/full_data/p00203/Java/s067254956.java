import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int W=cin.nextInt();
			int H=cin.nextInt();
			if((W|H)==0)break;
			int[][] field=new int[W][H];
			int[][] dp=new int[W][H];
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					field[j][i]=cin.nextInt();
				}
			}
			for(int i=0;i<W;i++){
				dp[i][0]=1;
			}
			int ans=0;
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(field[j][i]==1){
						dp[j][i]=0;
					}
					else if(field[j][i]==2){
						if(i+2>=H){
							ans+=dp[j][i];
						}
						else{
							dp[j][i+2]+=dp[j][i];
						}
					}
					else{
						if(i+1>=H){
							ans+=dp[j][i];
							continue;
						}
						if(j-1>=0){
							if(field[j-1][i+1]==0)
								dp[j-1][i+1]+=dp[j][i];
						}
						if(j+1<W){
							if(field[j+1][i+1]==0)
								dp[j+1][i+1]+=dp[j][i];
						}

						dp[j][i+1]+=dp[j][i];
					}
				}
			}
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
//					System.out.print(dp[j][i]+" ");
				}
//				System.out.println();
			}
			System.out.println(ans);
		}

	}

}