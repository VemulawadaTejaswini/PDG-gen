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
            int n=sc.nextInt();
            int[] lake = new int[n+1];
            int[] mountain = new int[n+1];

            for(int i=1;i<=n;i++){
                lake[i]=sc.nextInt();
                if(i%2==0){
                    mountain[1]-=lake[i];
                }else{
                    mountain[1]+=lake[i];
                }

            }
            
            for(int i=2;i<=n;i++){
                mountain[i]=2*lake[i-1]-mountain[i-1];
            }

            for(int i=1;i<=n;i++){
                System.out.print(mountain[i]+" ");
            }
    }
}