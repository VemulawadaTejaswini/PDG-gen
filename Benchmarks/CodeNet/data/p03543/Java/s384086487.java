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
            boolean [] vis = new boolean[10];
            int h = 0;
            while(n > 0){
                if(!vis[n % 10]){
                    h++;
                    vis[n % 10] = true;
                }
                n /= 10;
            }
            if(h > 2){
                out.println("No");
            } else {
                out.println("Yes");
            }
        }
    }
}
