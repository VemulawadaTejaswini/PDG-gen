/*import java.util.*;
import java.io.*;
import java.lang.*;
// ArrayList<Integer>[] arr=new ArrayList[n];
public class Main_E{	
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt(),w=s.nextInt();
        int[][] arr=new int[n+1][2];
        long[][] dp=new long[100001][101];
        
        for(int i=1;i<100001;i++){
            Arrays.fill(dp[i],(long)1e13); 
        }
        dp[0][0]=0;
        //dp[i][j] hold- minimum wt needed to get i values given j objects
        for(int i=1;i<=n;i++){
            arr[i][0]=s.nextInt(); arr[i][1]=s.nextInt();
        }

        for(int i=1;i<100001;i++){
            for(int j=1;j<=n;j++){
                if(arr[j][1]<=i){
                    dp[i][j]=Math.min(dp[i][j-1],arr[j][0]+dp[i-arr[j][1]][j-1]);
                }
                else{
                    dp[i][j]=dp[i][j-1];
                }
                //else{dp[j]=(long)1e13;}
            }
        }
        int res=0;
        for(int i=1;i<100001;i++){
            if(dp[i][n]<=w){res=i;}
        }       
        System.out.println(res);
    }
}

*/





import java.util.*;
import java.io.*;
import java.lang.*;
// ArrayList<Integer>[] arr=new ArrayList[n];
public class Main{  
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt(),w=s.nextInt();
        int[][] arr=new int[n+1][2];
        long[][] dp=new long[101][100001];
        
        for(int i=0;i<101;i++){
            Arrays.fill(dp[i],(long)1e13); 
        }
        for(int i=0;i<101;i++){
            dp[i][0]=0; 
        }
       
        //dp[i][j] hold- minimum wt needed to get i values given j objects
        for(int i=1;i<=n;i++){
            arr[i][0]=s.nextInt(); arr[i][1]=s.nextInt();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<100001;j++){
                if(arr[i][1]<=j){
                    dp[i][j]=Math.min(dp[i-1][j],arr[i][0]+dp[i-1][j-arr[i][1]]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
                //else{dp[j]=(long)1e13;}
            }
        }
        int res=0;
        for(int i=1;i<100001;i++){
            if(dp[n][i]<=w){res=i;}
        }       
        System.out.println(res);
    }
}
