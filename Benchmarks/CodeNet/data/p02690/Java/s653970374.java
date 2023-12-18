import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextInt();

        for(long A=0;; A++) for(long B=0; B<=A; B++){
            if(A*A*A*A*A-B*B*B*B*B==X){
                System.out.printf("%d %d\n", A, B);
                return;
            }
            if(A*A*A*A*A+B*B*B*B*B==X){
                System.out.printf("%d %d\n", A, -B);
                return;
            }
            if(-A*A*A*A*A-B*B*B*B*B==X){
                System.out.printf("%d %d\n", -A, B);
                return;
            }
            if(-A*A*A*A*A+B*B*B*B*B==X){
                System.out.printf("%d %d\n", -A, -B);
                return;
            }            
        }
    }
}
