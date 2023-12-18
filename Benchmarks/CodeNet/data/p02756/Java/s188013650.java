import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(sc.next());
        int q = sc.nextInt();

        boolean reverse = false;
        StringBuilder sento = new StringBuilder();
        StringBuilder ushiro = new StringBuilder();

        for (int i = 0; i < q ; i++) {
            if (sc.nextInt() == 1) {
                reverse = !reverse;
            } else {
                // 先頭に追加
                if (sc.nextInt() == 1) {
                    if (reverse) {
                        ushiro.append(sc.next());
                    } else {
                        sento.append(sc.next());
                    }
                } else {
                    if (reverse) {
                        sento.insert(0, sc.next());
                    } else {
                        ushiro.append(sc.next());
                    }
                }
            }
        }
        if (reverse) {
            sento.reverse();
            builder.reverse();
            ushiro.reverse();
            builder.append(sento);
            builder.insert(0, ushiro);
        } else {
            builder.append(ushiro);
            builder.insert(0, sento);
        }

        System.out.println(builder);
    }
}
