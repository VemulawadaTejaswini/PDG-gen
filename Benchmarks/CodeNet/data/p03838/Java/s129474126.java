import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = 2000000000;
        if (X <= Y) A = Math.abs(Y-X);
        int B = 2000000000;
        if (-X <= Y) B = Math.abs(Y+X)+1;
        int C = 2000000000;
        if (X <= -Y) C = Math.abs(-Y-X)+1;
        int D = 2000000000;
        if (-X <= -Y) D = Math.abs(-Y+X)+2;
        System.out.println(Math.min(Math.min(A, B), Math.min(C, D))); 
    }
    
}