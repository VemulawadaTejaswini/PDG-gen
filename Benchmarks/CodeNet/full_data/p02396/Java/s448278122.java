import java.util.*;

public class Main {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (scan.hasNext()) {
            int x = scan.nextInt();
            if(i>10000){
                break;
            }
            if (0 < x && x < 10001) {
                System.out.println("Case " + i + ": " + x);
                i++;
            }
        }
    }
}