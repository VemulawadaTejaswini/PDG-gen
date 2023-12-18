import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    static void solve(long X){
        for(long A = -200; A <=200; A++) for(long B = -200; B <=200; B++){
            if(A*A*A*A*A - B*B*B*B*B == X){
                System.out.printf("%d %d\n", A, B);
                return;
            }
        }
        System.out.printf("%d :(\n", X);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();

        solve(X);
    }
}
