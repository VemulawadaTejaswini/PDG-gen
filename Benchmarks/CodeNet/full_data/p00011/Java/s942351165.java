import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), n = sc.nextInt();
        int[] num = new int[w];
        for (int i=0; i<w; i++) num[i] = i+1;

        int a, b, tmp;
        String s;
        for (int i=0; i<n; i++) {
            s = sc.next();
            a = Integer.parseInt(s.split(",")[0]) - 1;
            b = Integer.parseInt(s.split(",")[1]) - 1;
            tmp = num[a];
            num[a] = num[b];
            num[b] = tmp;
        }

        for (int i : num) System.out.println(i);
    }
}