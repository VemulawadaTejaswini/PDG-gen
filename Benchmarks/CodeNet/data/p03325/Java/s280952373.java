import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        int ans = 0;
        boolean flg = true;
        while(flg) {
            Collections.sort(a);
            Collections.reverse(a);
            flg = false;
            for (int i = 0; i < n; i++) {
                if(!flg) {
                    if(a.get(i) % 2 == 0 && a.get(i) / 2 > 0) {
                        a.set(i, a.get(i) / 2);
                        flg = true;
                        ans++;
                    }
                }
                a.set(i, a.get(i) * 3);
            }
        }
        System.out.println(ans);
    }
}