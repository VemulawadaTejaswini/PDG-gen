import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long res = 0;

        int i, j;
        for (i = 0; i <= s.length(); i++) {
            for (j = 0; j < i; j++) {
                // System.out.println(Long.parseLong(s.substring(j, i)));
                if (Long.parseLong(s.substring(j, i)) % 2019 == 0) {
                    // System.out.println("#" + j + "#" + i);
                    res++;
                }
            }
        }
        System.out.println(res);

        sc.close();
    }
}
