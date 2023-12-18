import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int m = kbd.nextInt();
        int maxL = 0;
        int minR = n + 1;

        for (int i = 0; i < m; i++) {
            // L
            int tempL = kbd.nextInt();
            // R
            int tempR = kbd.nextInt();

            if (tempL > maxL) {
                maxL = tempL;
            }
            if (minR > tempR) {
                minR = tempR;
            }
        }
        if(minR-maxL<0){
            System.out.println(0);
        }else{
            System.out.println((minR - maxL)+1);
        }
    }
}