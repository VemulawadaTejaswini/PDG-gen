import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();

        int r = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 1) r++;
        }

        System.out.println((double)r / n);
    }
}