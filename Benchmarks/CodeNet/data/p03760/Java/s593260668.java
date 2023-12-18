import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        String e = sc.next();
        int tempO = o.length();
        int tempE = e.length();
        int i;
        for (i = 0; i < tempE; i++) {
                System.out.println(o.charAt(i));
               System.out.println(e.charAt(i));
        }
        if (tempO > i)
            System.out.println(o.charAt(i));
    }
}