/* package codechef; // don't place package name! */

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int A = s.nextInt();
        int B = s.nextInt();
        int ans;
        if((B-A)%2==0) ans = (B-A)/2;
        else
        {
            if(A-1<N-B) ans=B-1;
            else ans=N-A;
        }
        System.out.println(ans);
    }
}
