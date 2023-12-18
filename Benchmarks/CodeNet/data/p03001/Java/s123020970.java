import java.util.*;
//mport java.io.*;


public class Main{

    static int INFTY = Integer.MAX_VALUE;
    static int global =10;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
        long W = sc.nextInt();
        long H = sc.nextInt();
        long x = sc.nextInt();
        long y = sc.nextInt();
        
        String ans;
        if(x==W/2.0 && y==H/2.0){
            ans = W*H/2.0 + " " + 1 ;
        } else {
            ans = W*H/2.0 + " " + 0 ;
        }
        System.out.println(ans);
    }
        

}