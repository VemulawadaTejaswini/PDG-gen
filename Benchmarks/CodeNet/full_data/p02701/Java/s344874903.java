import java.util.*;
import java.lang.*;

public class Main{

    public static long solve(long n , String[] arr){//healt , str
        HashSet<String> set = new HashSet<>();
        long sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(!set.contains(arr[i])){
                sum++;
                set.add(arr[i]);
            }
        }

        return sum;
    }

    public static void gora(){
        Scanner scn = new Scanner(System.in);

        // long test = scn.nextLong();

        long n = scn.nextLong();

        String[] arr = new String[(int)n];
        // long b = scn.nextLong();


        // long c = scn.nextLong();

        // long d = scn.nextLong();
        // long arr[] = new long[n];
        scn.nextLine();
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextLine();
        }

        System.out.println(solve(n , arr));
    }

    public static void main(String args[]){
        gora();
    }
}


