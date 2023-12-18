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
        float W = sc.nextInt();
        float H = sc.nextInt();
        float x = sc.nextInt();
        float y = sc.nextInt();

        String ans;
        if(x==W/2.0 && y==H/2.0){
            ans = W*H/2.0 + " " + 1 ;
        } else if(y == H/W*x || y==(-H/W*x+H)){
            ans = W*H/2.0 + " " + 0 ;
        } else {
            float min2 = Math.min((H-y)*W,y*W);
            float min1 = Math.min((W-x)*H,x*H);
            float min = Math.max(min1,min2);
            ans= min + " " + 0 ;
        }
    
        System.out.println(ans);
    }
        

}