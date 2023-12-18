import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        int sum = 0;
        int index = 0;
        while (sum <= x && index != n) {
            sum += list[index++];
        }
        if (sum != x) {
            index--;
        }
        System.out.println(index);
    }
}