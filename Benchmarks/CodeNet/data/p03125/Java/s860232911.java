import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        solver(A, B);
    }

    public static void solver(int A, int B) {
        if(B % A == 0){
            out.println(A+B);
        } else {
            out.println(B - A);
        }
    }
}