import java.util.*;
import java.io.*;
 
public class Main{
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
 
    public static void main(String[] args) throws IOException{
        String S = sc.next();
        int A = 0;
        for(int i = 0; i < S.length(); i++){
            for(int j = i+3; j < S.length(); j++){
                String S1 = S.substring(i, j);
                int B = Integer.parseInt(S1);
                if(B%2019 == 0) A++;
            }
        }
        out.println(A);
        out.flush();
    }
}