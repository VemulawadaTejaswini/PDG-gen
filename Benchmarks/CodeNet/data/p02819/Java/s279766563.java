import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100000 + 2];
        for(int i = 2; i <= (100001 / 2) + 1; i++) {
            for(int j = i + 1; j <= 100001; j++) {
                if(j % i == 0) arr[j] = 1;
            }
        }
        int x = sc.nextInt();
        int ans = 0;
        for(int i = x; i < 100001; i++) {
            if(arr[i] == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
