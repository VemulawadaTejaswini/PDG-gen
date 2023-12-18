import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String before = s.substring(0, 2);
        String after = s.substring(2, 4);
        int bNum = Integer.valueOf(before);
        int aNum = Integer.valueOf(after);
        if(isMonthOk(bNum) && isMonthOk(aNum)) System.out.println("AMBIGUOUS");
        else if(!isMonthOk(bNum) && !isMonthOk(aNum)) System.out.println("NA");
        else if(isMonthOk(bNum)) System.out.println("MMYY");
        else System.out.println("YYMM");
    }
    private static boolean isMonthOk(int num) {
        return num >= 1 && num <= 12;
    }
}
