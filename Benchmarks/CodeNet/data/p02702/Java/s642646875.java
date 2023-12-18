import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        String s = sc.next();

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i +1; j < s.length(); j++) {
                String sub = s.substring(i, j+1);
                if (Long.parseLong(sub) % 2019 == 0) {
                    //System.out.printf("%d %d\n", i, j);
                    ans++;
                };
            }
        }
        System.out.println(ans);
    }
}
