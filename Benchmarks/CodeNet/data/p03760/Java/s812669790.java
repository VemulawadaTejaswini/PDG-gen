import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        String e = sc.next();
        int indexO = 0;
        int indexE = 0;
        while (indexO < o.length() || indexE < e.length()) {
            if(indexO < o.length()) {
                System.out.print(o.substring(indexO,indexO+1));
            }
            if(indexE < e.length()) {
                System.out.print(e.substring(indexE,indexE+1));
            }
            indexO++;
            indexE++;
        }
        System.out.println();
    }
}