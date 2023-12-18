import java.util.*;
import java.io.*;

public class Main{

    static int INFTY = Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
        int n= sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        Arrays.sort(arr,(a,b)->{
            if(a[1]>b[1]){
                return 1;
            } else if (a[1]<b[1]){
                return -1;
            } else{
                return 0;
            }
        });
        int sum=0;
        for (int[] eachArr : arr) {
            sum+=eachArr[0];
            if(sum>eachArr[1]){
                sum=-1;
                break;
            }
        }
        if(sum==-1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }


}