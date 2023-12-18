import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1,in,out);
        out.close();
    }
    static class Task{
        public void solve(int testNumber,Scanner in,PrintWriter out){
            int n = in.nextInt();
            long [] L = new long[n + 1];
            L[0] = 2;
            L[1] = 1;
            for(int i = 2 ; i <= n ; i++){
                L[i] = L[i - 1] + L[i - 2];
            }
            out.println(L[n]);
        }
    }
}
