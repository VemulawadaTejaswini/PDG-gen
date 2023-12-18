

import java.util.Scanner;

/**
 *
 * @author dannyyang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=Integer.parseInt(input.nextLine());
        String word=input.nextLine();
        long dp[][]=new long[N+1][N+1];
        dp[N][0]=1;
        int count=1;
        long mod=1000000000+7;
        for(int i=N-1;i>=1;i--){
            long sum=0;
            
                
            if(word.charAt(i-1)=='<'){
                
                for(int j=count;j>=0;j--){
                    sum+=dp[i+1][j];
                    dp[i][j]=sum;
                   // System.out.print(dp[i][j]+" ");
                }
               // System.out.println();
            }
            else{
                for(int j=0;j<=count;j++){
                    dp[i][j]=sum;
                    sum+=dp[i+1][j];
                   // System.out.print(dp[i][j]+" ");
                }
              //  System.out.println();
            }
            count++;
            
        }
        long answer=0;
        for(int i=0;i<N;i++){
            answer+=dp[1][i];
        }
        System.out.println(answer);
    }
    
}
