import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int ans = 0;
        int tmp = 0;
        while(s != 1) {
            if(s % 2 == 0) s /= 2;
            else s = s * 3 + 1;
            ans++;
        }
        System.out.println(ans + 2);
    }
}