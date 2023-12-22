import java.util.*;
import java.io.*;

public class Main{

    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        sc.close();
        final int[] f = new int[n+1];
        System.out.println(f(n,f));


       

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //    try{
        //         //int n= Integer.parseInt(br.readLine());
        //         //int[] array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();

                
                
        //     }catch(IOException e){e.printStackTrace();}
    }
    static int f(int n, int[] f){
        f[0]=1;
        if(n>=1){f[1]=1;}
        if(n>=2 && f[n]==0){f[n]=f(n-1,f)+f(n-2,f);}
        return f[n];
    }
}
    
