import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        int change = 0;
        for(int n=0; n<N; n++){
            char a = A.charAt(n);
            char b = B.charAt(n);
            char c = C.charAt(n);

            if(a==b && b==c) change += 0;
            else if(a==b || b==c || c==a) change += 1;
            else change += 2;
        }
        System.out.println(change);
    }
}
