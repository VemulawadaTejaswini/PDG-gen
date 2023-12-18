import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        for(int i = A; i <= B; i++){
            int a = i / 10000;
            int b = i % 10000 / 1000;
            int c = i % 100 / 10;
            int d = i % 10;
            if(a == d && b == c) ans++;
        }

        System.out.println(ans);
        sc.close();
    }

}
