import java.util.*;
import java.lang.*;

public class Main{

    public static void solve(long a , long b , long c , long k){
        long ans = 0;

        while(k != 0){
            while(k != 0 && a != 0){
            
                ans += 1;
                a--;
                k--;
            }

            while(k != 0 && b != 0){
                b--;
                k--;
            }
            while(k != 0 && c != 0){
                ans -= 1;
                c--;
                k--;
            }
        }

        System.out.println(ans);
    }

    public static void gora(){
        Scanner scn = new Scanner(System.in);

        // long test = scn.nextLong();

        long a = scn.nextLong();

        long b = scn.nextLong();

        long c = scn.nextLong();

        long k = scn.nextLong();

        // long arr[] = new long[n];

        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = scn.nextLong();
        // }

        solve(a, b, c, k);
    }

    public static void main(String args[]){
        gora();
    }
}


