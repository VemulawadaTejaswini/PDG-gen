import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int S=0;
        int W=0;
        int x;
        int res;
        
        for(int i=0; i<N; i++){
            x = Integer.parseInt(sc.next());
            S = S+x;
            W = W + (int) Math.pow(x,2);
        }

        int p = Math.round((float) S/N);
       
        res = N*((int) Math.pow(p,2))-2*p*S+W;
        System.out.println(res);   

        
    }
}
