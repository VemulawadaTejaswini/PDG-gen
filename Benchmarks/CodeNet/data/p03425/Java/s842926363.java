import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cnt = new int[5];  // MARCH

        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            switch(c) {
                case ('M'): cnt[0]++; break;
                case ('A'): cnt[1]++; break;
                case ('R'): cnt[2]++; break;
                case ('C'): cnt[3]++; break;
                case ('H'): cnt[4]++; break;
            }
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (cnt[i] == 0)
                continue;
            for (int j = i+1; j < 4; j++) {
                if (cnt[j] == 0)
                    continue;
                for (int k = j+1; k < 5; k++) {
                    if (cnt[k] == 0)
                        continue;
                    ans += cnt[i] * cnt[j] * cnt[k];
                }
            }
        }

        System.out.println(ans);
    }
}
