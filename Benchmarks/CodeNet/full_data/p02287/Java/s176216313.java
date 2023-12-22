import java.io.*;
import java.util.*;

class Main{
 public static int[] A;
    public static void main(String[] args){
        int i;
        int n=0;
        String s;
        //int[] A;
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            s = bf.readLine();
            n = Integer.parseInt(s);
            A = new int[n+1];
            StringTokenizer S = new StringTokenizer(bf.readLine());

            for(i=1 ; i<=n ; i++){
                A[i] = Integer.parseInt(S.nextToken());
            }
            bf.close();
        }
        catch(IOException e){
        System.out.println(e);
        }

        for(i=1 ; i<=n ; i++){
            System.out.print("node "+i+": key = "+A[i]+", ");
            if( (i/2) != 0 ){
                System.out.print("parent key = "+A[(i/2)]+", ");
            }
            if( (2*i) <= n ){
                System.out.print("left key = "+A[(2*i)]+", ");
            }
            if( (2*i+1) <= n ){
                System.out.print("right key = "+A[(2*i+1)]+", ");
            }
            System.out.print("\n");
        }
    }
}

