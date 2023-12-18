import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long count = scanner.nextLong();
        long blue = scanner.nextLong();
        long red = scanner.nextLong();
        
        long balls = 0;
        long bcount = 0;
        for (int i = 0; balls < count ; i++) {
            if (count <= blue) {
                bcount = count;
                break;
            }
            if (i % 2 == 0) {
                balls += blue;
                bcount += blue;
            } else {
                balls += red;
            }
            if (balls > count && i % 2 == 0) {
                bcount = bcount - (balls - count);
            }
            
        }
        
        System.out.println(bcount);
    }
}