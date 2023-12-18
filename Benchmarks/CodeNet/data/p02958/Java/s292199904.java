import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 0, value = 0;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            if (v != i + 1) {
                if (index == 0) {
                    index = i;
                    value = v;
                } else if (value != i + 1) {
                    System.out.println("NO");
                    sc.close();
                    return;
                }
            }
        }
        sc.close();
        System.out.println("YES");
    }
}
