import java.util.*;
import java.io.*;

public class Main{
    public static void main (String args[]){

        //初期処理
        //Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n= Integer.parseInt(br.readLine());
            String[] sElementArray = br.readLine().split(" ");
            int[] elementArray = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
            int q = Integer.parseInt(br.readLine());
            String[] sTargetArray = br.readLine().split(" ");
            int[] targetArray = Arrays.stream(sTargetArray).mapToInt(Integer::parseInt).toArray();
        
        for (int var : targetArray) {
            boolean ans=solve(0,var,n,elementArray);
            if (ans){System.out.println("yes");}else{System.out.println("no");}
        }
        }catch(IOException e){e.printStackTrace();}
    }

    public static boolean solve (int i, int m, int n, int[] elementArray){
        if (m==0){
            return true;
        } else if (i==n){
            return false;
        } else{
            return (solve(i+1,m-elementArray[i],n,elementArray)|| solve(i+1,m,n,elementArray));
        }
    }
}

