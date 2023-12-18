import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float res = 0;

        for(int i = 0; i < n; i++) {
            if(i % 3 == 0 || i % 5 == 0) continue;
            res += i;
        }

        System.out.print((int)res);
    }
}
