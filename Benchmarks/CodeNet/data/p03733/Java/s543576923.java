import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shoya on 2017/04/30.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = sc.nextInt();
        int T = sc.nextInt();
        ArrayList<Integer> t = new ArrayList<Integer>();
        for (int i = 0; i < N; i++){
            t.add(sc.nextInt());
        }

        int prev = -1;
        long ans = 0;
        for (int i : t){
            //System.out.println(i);
            if (prev != -1 && i - prev < T){
                ans += i - prev;
            }
            else{
                ans += T;
            }
            prev = i;
        }

        pw.println(ans);
        pw.flush();
        return;
    }
}