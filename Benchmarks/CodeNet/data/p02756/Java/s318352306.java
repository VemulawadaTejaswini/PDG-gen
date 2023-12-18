import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            if (sc.nextInt() == 1) {
                S.reverse();
            } else {
                if (sc.nextInt() == 1) {
                    S.insert(0,sc.next());
                } else {
                    S.append(sc.next());
                }
            }
        }
        System.out.println(S);
    }
}