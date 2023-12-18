import java.util.*;
import java .io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        List<Integer> ht = new ArrayList<>();
        while(n > 0) {
            ht.add(s.nextInt());
            n--;
        }
        Collections.sort(ht);
        int ans = Integer.MAX_VALUE;
        for(int i = k - 1; i < ht.size() ; i++) {
            ans = min(ans,ht.get(i) - ht.get(i - k + 1));
        }
        System.out.println(ans);
    }
    static int min(int a, int b) {
        return a < b ? a : b;
    }
}
