
import java.util.*;

public class Main {
    private final static Main main = new Main();

    public static void main(String[] args) {
        main.contest();
    }

    private void contest() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 2;
        int[] list = new int[n];
        for (int i=0; i<n; ++i) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        int sum = 0;
        for(int i=0; i<n; i+=2) {
            sum += list[i];
        }
        System.out.println(sum);
    }
}
