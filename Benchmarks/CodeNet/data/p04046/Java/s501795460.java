import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);

        int h=scan.nextInt();
        int w=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        long [][]map=new long [h+1][w+1];
        long []ans=new long [w];
        long []tmp=new long [w];
        long mod=1000000007;



        tmp[w-1]=1;
       for(int i=w-2;i<=0;i--)
           tmp[i]=tmp[i+1];
        for(int i=h-1;i>=0;i--){
            for(int j=w-1;j>=0;j--){
                if(j!=w-1)
                    ans[j]=(tmp[j]+ans[j+1])%mod;
                else
                    ans[j]=tmp[j];
                if(j<=b-1 && i>=h-a) {
                    map[i][j] = 0;
                    ans[j]=0;
                }

            }

            for(int j=0;j<w;j++){
                tmp[j]=ans[j];
               // System.out.printf("%5d  ",ans[j]);
            }
            //System.out.println();
        }
        System.out.println(ans[0]);
    }
}