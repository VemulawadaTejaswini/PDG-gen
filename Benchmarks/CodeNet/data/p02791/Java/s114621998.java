import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] arr = new int[num+1];
        for (int i=0; i<num; i++) {
            arr[i] = scanner.nextInt();
        }

        int cnt = 0;
        for (int i=0; i<=num-1; i++) {
            if (arr[i+1] > arr[i]) continue;
            cnt++;
        }

        System.out.println(cnt);
    }
}