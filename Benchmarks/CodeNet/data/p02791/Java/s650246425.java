import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans =0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if(n <= min){
                min = n;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
