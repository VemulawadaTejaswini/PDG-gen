import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();

        int sum = 0;
        int ans = 0;
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
            sum += list[i];
        }

        int mid = (int) (sum / N);

        for (int i = 0; i < N; i++) {
            ans += Math.pow(list[i]-mid,2);
        }

        System.out.println(ans);
    }
}