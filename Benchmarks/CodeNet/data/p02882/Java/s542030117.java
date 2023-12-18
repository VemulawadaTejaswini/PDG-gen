
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        double A;
        double B;
        double X;


        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextDouble();
            B = sc.nextDouble();
            X = sc.nextDouble();
        }
        double C = X / A;
        double result=0;
        if(C <= ((A*B)/2)){
            double aa = (C /B)*2;
            double bb = B;
            double cc = Math.sqrt((aa*aa) + (bb* bb));
            double radR = Math.acos(aa /cc);

            result = Math.toDegrees(radR);
        }else{
            double bb = (((A*B)-C) /A)*2;
            double aa = A;
            double cc = Math.sqrt((aa*aa) + (bb* bb));
            double radR = Math.acos(aa /cc);

            result = Math.toDegrees(radR);
        }
        System.out.println(result);


    }


}
