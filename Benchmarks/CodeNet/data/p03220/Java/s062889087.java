import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int T = Integer.parseInt(scan.next());
        int A = Integer.parseInt(scan.next());
        int H;
        int temp;
        int res = 0;
        int cc = -(int)(50 - 100000 * 0.006);

        for(int i = 1; i <= N; i++){
            H = Integer.parseInt(scan.next());
            temp = (int)((T - H * 0.006) - A);
            if(temp < 0 ) temp = -temp;
            if(temp < cc){
                cc = temp;
                res = cc;
            }
        }

        System.out.println(res);
    }
}