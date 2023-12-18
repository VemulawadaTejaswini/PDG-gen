import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = Long.parseLong(sc.next());
        System.out.println(50);
        if (0<=K && K<=50) {
            for (int i=0;i<50;i++) {
                if (i<K) {
                    System.out.println(50-i);
                } else {
                    System.out.println(0);
                }
                if (i==49) {
                    return;
                }
            }
        }
        for (int i=0;i<50;i++) {
            long out = (i+1)+(K/50-1);
            if ((i+1)>(50-(K%50))) {
                out++;
            }
            System.out.println(out);
        }
    }
}