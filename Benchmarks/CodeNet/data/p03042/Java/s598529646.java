import java.util.*;


public class Main {
    static boolean calc1(int a){
        if(0 < a && a < 13)
        return true;
        else
        return false;
    }
    static boolean calc2(int a){
        if(0 < a)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line1 = line.substring(0, 2);
        String line2 = line.substring(2, 4);
        int a = Integer.parseInt(line1);
        int b = Integer.parseInt(line2);
        if(calc2(a) && calc1(b) && calc2(a) && calc1(b))
        System.out.println("AMBIGUOUS");
        else if(calc1(a) && calc2(b))
        System.out.println("MMYY");
        else if(calc2(a) && calc1(b))
        System.out.println("YYMM");
        else
        System.out.println("NA");
    }
}