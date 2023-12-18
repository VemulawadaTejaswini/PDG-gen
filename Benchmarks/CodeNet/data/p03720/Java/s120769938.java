import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] count = new int[n];
        for(int i = 0;i < m;i++) {
            count[sc.nextInt() - 1]++;
            count[sc.nextInt() - 1]++;
        }
        
        Arrays.stream(count).forEach(System.out::println);
    }
}
