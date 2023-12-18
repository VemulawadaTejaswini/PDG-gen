import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        long count = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            s[i] = "";
            for (int j = 0; j < c.length; j++) {
                s[i] += String.valueOf(c[j]);
            }
        }
        Arrays.sort(s);
        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = i + 1; j < n; j++) {
                if (s[i].equals(s[j])) {
                    count++;
                    flag++;
                } else {
                    if (flag >= 1)
                        break;
                }
            }
        }
        System.out.println(count);
    }
}
