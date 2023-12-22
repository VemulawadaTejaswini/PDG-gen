import java.util.*;

class Main {

    static int[] balls;

    static boolean Fall (int n, int B, int C) {
        if ( n == 10 )  return true;

        if ( B < balls[n] && Fall( n+1, balls[n], C) )  return true;
        if ( C < balls[n] && Fall( n+1, B, balls[n]) )  return true;

        return false;
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        
        while (sc.hasNext()) {
            balls = new int[10];
            for (int i = 0; i < 10; i++) {
                balls[i] = sc.nextInt();
            }
            
            if (Fall(1, balls[0], 0)) System.out.println("YES");
            else    System.out.println("NO");
        }
         
    }
}