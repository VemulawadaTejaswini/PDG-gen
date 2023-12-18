
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int med = N / 2;
        String S = sc.next();

        int hatukuro = S.indexOf("#");
        if (hatukuro == -1) {
            System.out.println("0");
            System.exit(0);
        }

        int hatusiro = S.lastIndexOf(".");
        if (hatusiro == -1) {
            System.out.println("0");
            System.exit(0);
        }

//        if (med < hatukuro) {
//            if (med < hatusiro) {
//                //白優勢
//            } else if (hatusiro < med) {
//                //両者不利
//            }else{
//                
//            }
//        }

        int countWtoB = 0;
        for (int ct = hatukuro; ct < N; ct++) {
            if (S.charAt(ct) == '.') {
                countWtoB++;
            }
        }

        int countBtoW = 0;
        for (int ct = hatusiro; -1 < ct; ct--) {
            if (S.charAt(ct) == '#') {
                countBtoW++;
            }
        }
        System.out.println(countBtoW<countWtoB? countBtoW : countWtoB);
    }
}
