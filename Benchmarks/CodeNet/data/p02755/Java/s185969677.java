import java.util.*;
import java.lang.*;
public class Main {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            double rateA=.08;
            double rateB=.1;
            double potentialA = (A/rateA);
            double potentialB = (B/rateB);
            double lowestPrice=0;
            boolean possible=false;
            int bPrice = (int) (potentialA*rateB);
            int aPrice = (int) (potentialA*rateA);
            if(bPrice==B&&aPrice==A){
                System.out.println((int)potentialA);
            }
            else{
                bPrice = (int) (potentialB*rateB);
                aPrice = (int) (potentialB*rateA);
                if(bPrice==B&&aPrice==A){
                    System.out.println((int)potentialB);
                }
                else{
                    System.out.println(-1);
                }
            }

        }
}



