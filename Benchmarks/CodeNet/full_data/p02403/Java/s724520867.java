import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            for (int j = 0; j < h; j++) {
                String s = "";
                for (int i = 0; i < w; i++) {

                    s = s + "#";
                }
                System.out.println(s);
             
            }
            if (h == 0 || w == 0) {
                break;
            }
     System.out.print("\n");
        }
      
    }

}