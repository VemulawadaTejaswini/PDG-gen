import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long value = scanner.nextLong();
        long count = scanner.nextLong();
        scanner.nextLine();
        String anti = scanner.nextLine();
        int valn = 0;
        aaa : while(true) {
            valn += value;
            String[] val = anti.split(" "); 
            String va = String.valueOf(valn);
            for (String v : val) {
                if(-1 < va.indexOf(v)) {
                    continue aaa;
                }
            }
            break;
        }
        System.out.println(valn);
    }
}