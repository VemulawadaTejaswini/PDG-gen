import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int[] l = new int[10];
            for (int j = 0; j < 10; j++) {
                l[j] = sc.nextInt();
            }
            Arrays.sort(l);
            System.out.println(l[7] + l[8] + l[9]);
        }
    }
}
