import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if(a[i] == 1) {
                list.add(b[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i);
            for (int j = 0; j < a.length; j++) {
                if(a[j] == tmp) {
                    if(b[j] == n) {
                        System.out.println("POSSIBLE");
                        return;
                    }
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}