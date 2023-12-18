import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 1; i < N; i++) {
            int v = sc.nextInt();
            ++arr[v-1];
        }
        for(int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
