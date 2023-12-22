import java.util.*;
import java.lang.*;

public class Main{

    public static long solve(String str){//healt , str
        long num = 0;
        long ans = 0;
        for(int i = 0 ; i < str.length() - 2 ; i++){
            num = 0;
            for(int j = i ; j < str.length(); j++){
                num = num*10 + (int)(str.charAt(j)-'0');
                // System.out.println(num);
                if((num % 2019) == 0){
                    ans++;
                    // num %= 2019;
                } 
                
            }
        }

        return ans;
    }

    public static void gora(){
        Scanner scn = new Scanner(System.in);

        // long test = scn.nextLong();

        // long n = scn.nextLong();

        // String[] arr = new String[(int)n];
        // long b = scn.nextLong();


        // long c = scn.nextLong();

        // long d = scn.nextLong();
        // long arr[] = new long[n];
        String str = scn.nextLine();
        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = scn.nextLine();
        // }

        System.out.println(solve(str));
    }

    public static void main(String args[]){
        gora();
    }
}


