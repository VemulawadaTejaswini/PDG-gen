import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> z;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String p = "";
        String q = "";
        for (int i = 0; i < n; i++) {
            p += sc.next();
        }
        for (int i = 0; i < n; i++) {
            q += sc.next();
        }
        String s = "";
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        int first = 0;
        int second = 0;
        z = new ArrayList<>();
        permutation(s,"");
        for(int i = 0; i < z.size(); i++) {
            if(z.get(i).equals(p)) {
                first = i + 1;
            }
            if(z.get(i).equals(q)) {
                second = i + 1;
            }
        }
        int ans = Math.abs(first - second);
        System.out.println(ans);
    }

    public static void permutation(String q, String ans){
        if(q.length() <= 1) {
            z.add(ans + q);
         }
         else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                ans + q.charAt(i));
            }
         }
    }
}