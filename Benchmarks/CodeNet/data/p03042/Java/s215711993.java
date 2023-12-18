import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int zenhan = Integer.parseInt(s.substring(0,2));
        int kouhan = Integer.parseInt(s.substring(2));

        if (isTuki(zenhan)){
            if (isTuki(kouhan)){
                System.out.println("AMBIGUOUS");
            }else {
                System.out.println("MMYY");
            }
        }
        else {
            if (isTuki(kouhan)){
                System.out.println("YYMM");
            }
            else {
                System.out.println("NA");
            }
        }
    }

    private static boolean isTuki (int a){
        return a >= 1 && a <=12;
    }
}