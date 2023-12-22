import java.util.*;
import java.lang.*;

public class Main{

    public static void solve(long a , long b,long c , long d){//healt , str
        while(a > 0 && c > 0){
            c -= b;
            if(c <= 0){
                System.out.println("Yes");
                return;
            }
            a -= d;
        }

        if(c == 0){
                System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void gora(){
        Scanner scn = new Scanner(System.in);

        // long test = scn.nextLong();

        long a = scn.nextLong();

        long b = scn.nextLong();


        long c = scn.nextLong();

        long d = scn.nextLong();
        // long arr[] = new long[n];

        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = scn.nextLong();
        // }

        solve(a,b,c,d );
    }

    public static void main(String args[]){
        gora();
    }
}


