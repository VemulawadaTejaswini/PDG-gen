import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        String[] b = sc.next().split("");
        Arrays.sort(a);
        Arrays.sort(b);
        int length = a.length;
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (!a[i].equals(b[i])) {
                cnt++;
            }
        }
        if (cnt < 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
