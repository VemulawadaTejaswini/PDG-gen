import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC153D - Caracal vs Monster

        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();

        long xx = h;
        long wk = 0;
        int cnt = 0;
        while(true) {
            wk = xx / 2;
            if (wk == 1) break;
            cnt++;
            xx = wk;
        }
        
//        System.out.println("cnt=" + cnt);
//        System.out.println("xx=" + xx);
        
        ArrayList<Long> m = new ArrayList<>();
        m.add(xx);

        long atk = 0;
        while(true) {
            long x = m.get(0);
            m.remove(0);
            atk++;
            if (x > 1) {
                m.add(x / 2);
                m.add(x / 2);
            }
            if (m.size() == 0) break;
        }

//        System.out.println("atk=" + atk);

        long ans = atk;
        for (int i = 0; i < cnt; i++) {
            ans *= 2;
        }
        
        if (cnt > 0) ans++;

        System.out.println(ans);
    }

}