import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Double N = Double.parseDouble(scan.next());
        Double T = Double.parseDouble(scan.next());
        Double A = Double.parseDouble(scan.next());
        Double H;
        Double temp;
        Double res = 0.0;
        Double cc = -(50 - 100000 * 0.006);

        for(int i = 1; i <= N; i++){
            H = Double.parseDouble(scan.next());
            temp = (T - H * 0.006) - A;
            if(temp < 0 ) temp = -temp;
            if(temp < cc){
                cc = temp;
                res = cc;
            }
        }

        System.out.println(res);
    }
}