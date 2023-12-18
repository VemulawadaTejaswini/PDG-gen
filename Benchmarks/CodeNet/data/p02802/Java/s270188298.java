import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> submit = new TreeMap<>();
        for (int i = 1; i <= N; i++){
            submit.put(i,0);
        }

        int M = sc.nextInt();
        int AC = 0;
        int WA = 0;
        for (int i = 0; i < M; i++){
            int p = sc.nextInt();
            String S = sc.next();
            if (submit.get(p) == 0) {
                if (S.equals("AC")) {
                    submit.put(p, 1);
                    AC++;
                } else {
                    WA++;
                }
            }
        }
        System.out.print(AC + " " + WA);
    }
}
