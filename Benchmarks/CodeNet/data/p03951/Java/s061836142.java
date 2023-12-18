import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int ans =2*s.length();
        for(int i=0; i<= n; i++){
            if(s.substring(s.length()-i).equals(t.substring(0,i))){
                ans = 2*s.length()-i;
            }
        }
        System.out.println(ans);


    }
}
