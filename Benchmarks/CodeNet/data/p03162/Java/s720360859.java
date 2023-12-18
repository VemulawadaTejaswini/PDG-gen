
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        for(int i=0;i<N;i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
        }

        int[][] dp = new int[N][3];
        fill(dp);
        int max = Integer.MIN_VALUE;
        max = Math.max(maxValue(a,b,c,N-1,1),max);

        max = Math.max(maxValue(a,b,c,N-1,2),max);

        max = Math.max(maxValue(a,b,c,N-1,3),max);

        System.out.println(max);


    }

    public static void fill(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<3;j++){
                dp[i][j] = -1;
            }
        }
    }

    public static int maxValue(int[] a,int[] b,int[] c,int index,int lastElement){
        if(index<0){
            return 0;
        }

        if(lastElement == 1){
            return Math.max(maxValue(a,b,c,index-1,2) + b[index],maxValue(a,b,c,index-1,3) + c[index]);
        }
        else if(lastElement == 2){
            return Math.max(maxValue(a,b,c,index-1,1)+a[index] , maxValue(a,b,c,index-1,3)+c[index]);
        }
        else{
            return Math.max(maxValue(a,b,c,index-1,1)+a[index],maxValue(a,b,c,index-1,2)+b[index]);
        }
    }
}