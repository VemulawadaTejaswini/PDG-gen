import java.util.*;
import java.lang.*;

public class Main{

    public static void solve(String s , String t){
      if(s.length() == 0){
        System.out.println("Yes");
        return;
      }
      for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != t.charAt(i)){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    public static void gora(){
        Scanner scn = new Scanner(System.in);

        // long test = scn.nextLong();

        String s = scn.nextLine();

        String t = scn.nextLine();

        // long arr[] = new long[n];

        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = scn.nextLong();
        // }

        solve(s, t);
    }

    public static void main(String args[]){
        gora();
    }
}


