import java.util.Scanner;
import java.util.Arrays;
public class Main{
	//static int n,k,u[],min[count],max;
    static int dp[]=new int[100000];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data[]=new int[100000];
		int num;
        num=sc.nextInt();
        for(int i=0;i<num;i++){
            data[i]=sc.nextInt();
            int j=i;
            while(true){
                if(j==0){
                    dp[i]=1;
                    break;
                }
                if(data[i]>data[j-1]){
                    dp[i]=dp[j-1]+1;
                    break;
                }
                j--;
            }
        }
        int max=dp[0];
        for(int i=1;i<num;i++){
            if(max<dp[i]){
                max=dp[i];
            }
            // System.out.print(dp[i]+" ");
            // System.out.println(data[i]);
        }
        System.out.println(max);
    }
}