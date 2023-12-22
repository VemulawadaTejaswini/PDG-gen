import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h[] = new int[10];
        for (int i = 0; i < h.length; i++)
            h[i] = sc.nextInt();

        Arrays.sort(h);

        System.out.println(h[9]);
        System.out.println(h[8]);
        System.out.println(h[7]);
    }
}