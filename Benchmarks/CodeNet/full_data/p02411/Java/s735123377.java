import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if(m == -1 && f == -1 && r == -1) break;
            String sc = "";
            if(m == -1 || f == -1) sc = "F";
            else if(m + f >= 80)   sc = "A";
            else if(m + f >= 65)   sc = "B";
            else if(m + f >= 50)   sc = "C";
            else if(m + f >= 30) {
                if(r >= 50) sc = "C";
                else        sc = "D";
            } else {
                sc = "F";
            }
            System.out.println(sc);
        }
    }
}