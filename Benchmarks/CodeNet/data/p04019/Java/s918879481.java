import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int cN = 0;
        int cS = 0;
        int cE = 0;
        int cW = 0;
        char ultimo = 'A';
        for (int i = 0; i < x.length(); i++) {
            ultimo = x.charAt(i);
            switch (ultimo) {
                case 'N':
                    cN++;
                    break;
                case 'S':
                    cS++;
                    break;
                case 'E':

                    cE++;
                    break;
                case 'W':
                    cW++;
                    break;
            }
        }

        if (((cN > 0 && cS > 0) || (cN == 0 && cS == 0)) && ((cE > 0 && cW > 0) || (cE == 0 && cW == 0))) {
            System.out.println("Yes");
            return;
        } 
        
        
        System.out.println("No");
    }

}