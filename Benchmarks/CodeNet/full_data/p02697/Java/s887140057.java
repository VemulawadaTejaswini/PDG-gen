import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int bkup = n / 2;
        int right = n;
        int tmp = 0;
        for(int i = m; i > 0; i--){
            System.out.println(String.format("%d %d", right - i, right));
            right--;
            tmp = right;
            right = bkup;
            bkup = tmp;
        }
    }
}