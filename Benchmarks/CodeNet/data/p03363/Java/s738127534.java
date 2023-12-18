import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int[][]sum=new int[N][N];
        sum[0][0]=A[0];
        int x=0;
        if(sum[0][0]==0){
            x++;
        }
        for(int i=1;i<N;i++){
            sum[0][i]=sum[0][i-1]+A[i];
            if(sum[0][i]==0){
                x++;
            }
        }
        for(int i=1;i<N;i++){
            sum[i][N-1]=sum[0][N-1]-sum[0][i-1];
            if(sum[i][N-1]==0){
                x++;
            }
        }
        int summ=0;
        for(int i=1;i<N;i++){
            for(int j=i+1;j<N-1;j++){
                sum[i][j]=sum[0][N-1]-sum[0][i-1]-sum[j+1][N-1];
                if(sum[i][j]==0){
                    x++;
                }

            }
        }
        System.out.println(x);
   


        

        
}
        
        
    }
