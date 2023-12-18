import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;

        if (Math.abs(A - B) >= 2) {
            System.out.println(Math.max(A,B) * 2 - 1);
        } else if (Math.abs(A - B) == 1) {
            System.out.println(A+B);
        }else if(Math.abs(A-B)==0){
            System.out.println(A+B);
        }

    }


}
