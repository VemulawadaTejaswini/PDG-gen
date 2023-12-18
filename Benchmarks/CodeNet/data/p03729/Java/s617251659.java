import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();
        String strC = sc.next();

        // System.out.println(strA.substring( strA.length()-1 ));
        // System.out.println(strB.substring(0,1));


        // 判定
        boolean isShiritori = (strA.substring( strA.length()-1 )).equals(strB.substring(0,1)) &&
                              (strB.substring( strB.length()-1 )).equals(strC.substring(0,1));

        if (isShiritori) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


