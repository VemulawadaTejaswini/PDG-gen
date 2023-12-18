import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();
        String ans = "EQUAL";
        
        if (A.length > B.length) {
            ans = "GREATER";
        } else if (A.length < B.length) {
            ans = "LESS";
        } else {
            for (int i = 0; i < A.length; i++) {
                if (A[i] > B[i]) {
                    ans = "GREATER";
                    break;
                } else if (A[i] < B[i]) {
                    ans = "LESS";
                    break;
                }
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}