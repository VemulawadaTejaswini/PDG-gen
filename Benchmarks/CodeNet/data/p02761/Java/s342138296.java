
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for (int i = 0; i < M; i++) {
            int tmp = scan.nextInt();
            int restriction = scan.nextInt();
            switch (tmp) {
                case 1:
                    if(first != null && first != restriction){
                        os.println("-1");
                        return;
                    }
                    first = restriction;
                    break;
                case 2:
                    if(second != null && second != restriction){
                        os.println("-1");
                        return;
                    }
                    second = restriction;
                    break;
                case 3:
                    if(third != null && third != restriction){
                        os.println("-1");
                        return;
                    }
                    third = restriction;
                    break;
            }
        }

        if(N == 1) {
            if(first != null) {
                os.println(first);
            } else {
                os.println(0);
            }
        } else if (N == 2) {
            if(first != null) {
                if(first == 0) {
                    os.println(-1);
                    return;
                }
            } else {
                first = 1;
            }
            if(second != null) {
                os.println(first*10 + second);
            } else {
                os.println(first*10);
            }
        } else if (N == 3) {
            if(first != null) {
                if(first == 0) {
                    os.println(-1);
                    return;
                }
            } else {
                first = 1;
            }
            if(second == null)
                second = 0;
            if(third != null) {
                os.println(first*100 + second*10 + third);
            } else {
                os.println(first*100 + second*10);
            }
        }
    }
}