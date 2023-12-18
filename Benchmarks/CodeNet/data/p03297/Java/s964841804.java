import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            HashMap<Long,Integer> m = new HashMap<>();
            long now = a;
            long pren = -1;
            boolean ok = true;
            while(true) {
                if(now < b) {
                    ok = false;
                    break;
                }
                if(pren != -1) {
                    if(now >= pren) {
                        ok = true;
                        break;
                    }
                }
                pren = now;
                if(m.containsKey(now)) break;
                m.put(now, 1);
                if(now % b <= c) {
                    now = now % b + d;
                } else {
                    now = now % b;
                }
            }
            if(ok) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}