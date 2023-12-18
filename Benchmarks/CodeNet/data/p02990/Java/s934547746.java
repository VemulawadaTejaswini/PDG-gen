import java.util.*;
import java.io.*;



public class Main{
    static int INFTY=Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
            
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=1;i<=k;i++){
            long ans=(downMulti(n-k+1, i)/downMulti(i, i)*downMulti(k-1, i-1)/downMulti(i-1, i-1))%(1000000000+7);
            System.out.println(ans);


        }
    }

    static long downMulti(int n,int i){
        if(i==0){return 1;}
        long ret=n;
        for(int j=1;j<i;j++){
            ret=ret * (n-j);
        }
        return ret;
    }
}