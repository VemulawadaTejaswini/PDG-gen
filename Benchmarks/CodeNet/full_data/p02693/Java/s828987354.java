
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (b <= a) {
            System.out.println("NG");
        } else {
            int count = 0;
            for (int s = a; (s >= a && s <= b); s++) {
                 if(k % s == 0){
                     count = count + 1 ;
                 }
            }
            if (count > 0) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
   }
}
