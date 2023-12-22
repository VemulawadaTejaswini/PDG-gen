import java.util.Scanner;

public class Main {
    public static int number;
    public static int table[];
    public static boolean check[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        table = new int[number];
        check = new boolean[2000 + 1];
        for (int i = 0; i < number; i++){
            table[i] = scan.nextInt();
        }
        solve(0, 0);
        int q = scan.nextInt();
        for (int i = 0; i < q; i++){
            int m = scan.nextInt();
            if(check[m]){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        scan.close();
    }

    public static void solve(int i, int m) {
        if (i == number) {
            check[m] = true;
            return;
        }

        solve(i+1, m);
        if (m + table[i] <= 2000) {
            solve(i+1, m+table[i]);
        }
    }
}
