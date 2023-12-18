import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC158C - Tax Increase

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int a8 = (int)(a / 0.08);
        int t8 = a8;
        while(true) {
            --t8;
            if ((int)(t8 * 0.08) == a) {
                a8 = t8;
            } else {
                break;
            }
        }

        int b10 = a8;
        int ans;
        while(true) {
            if ((int)(b10 * 0.1) == b) {
                if ((int)(b10 * 0.08) == a) {
                    ans = b10;
                } else {
                    ans = -1;
                }
                break;
            } else if ((int)(b10 * 0.1) > b){
                ans = -1;
                break;
            }

            ++b10;
        }

        System.out.println(ans);
    }
}