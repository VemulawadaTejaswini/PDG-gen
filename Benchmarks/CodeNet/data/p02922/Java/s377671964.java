import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = b/(a-1);
        int count = ((a-1)*ans)+1;
        if (count < b) {
            ans++;
        }
        System.out.println(ans);
    }
}
