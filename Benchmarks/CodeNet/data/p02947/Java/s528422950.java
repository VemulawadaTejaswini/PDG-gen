import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] s = new String[N];

        for (int i=0;i<N;i++) {
            String si = sc.next();
            char[] ci = si.toCharArray();
            Arrays.sort(ci);
            s[i] = String.valueOf(ci);
        }

        Arrays.sort(s);

        int ans = 0;
        for (int i=0;i<N-1;i++) {
            for (int j=i+1;j<N;j++) {
                if (s[i].equals(s[j])) ans++;
                else break;
            }
        }

        System.out.println(ans);
    }
}
