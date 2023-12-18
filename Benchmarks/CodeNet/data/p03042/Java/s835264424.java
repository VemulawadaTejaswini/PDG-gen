import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Integer.valueOf(s.substring(0,2));
        int b = Integer.valueOf(s.substring(2, 4));
        if(0 < a && a < 13){
            if(0 < b && b < 13) System.out.println("AMBIGUOUS");
            else System.out.println("MMYY");
        }else{
            if(0 < b && b < 13) System.out.println("YYMM");
            else System.out.println("NA");
        }
        sc.close();

    }

}
