import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans[] = new int [N];

        int count = 0;
        for (int flg = 1; flg <= N; flg++) {

            for (int a = 1; a < flg; a++) {
                for (int b = 1; b < flg-a; b++) {
                    for (int c = 1; c < flg-(a+b); c++) {
                        if ((a*a + b*b + c*c + a*b + b*c + c*a) == flg) {
                            ans[flg-1]++;
                            System.out.println(c);
                        }
                    }
                }
            }
            System.out.println(ans[flg-1]);
        };
    }
}