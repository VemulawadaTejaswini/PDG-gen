import java.util.*;
import java.lang.*;
public class Main {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            double rateA=.08;
            double rateB=.1;
            double lowestPrice = (A/rateA);
            int bPrice = (int) (lowestPrice*rateB);
            int aPrice = (int) (lowestPrice*rateA);
            if(bPrice==B&&aPrice==A){
                System.out.println((int)lowestPrice);
            }
            else{
                System.out.println(-1);
            }

        }
}



