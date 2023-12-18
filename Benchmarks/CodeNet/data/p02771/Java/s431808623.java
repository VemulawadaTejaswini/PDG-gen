import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int X = stdIn.nextInt();
        int B = stdIn.nextInt();
        int C = stdIn.nextInt();
        stdIn.close();
 
        if (X == B && B != C) {
            System.out.println("Yes");
        } else if(X == C && B != C) {
            System.out.println("Yes");
        } else if(B == C && X != C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}