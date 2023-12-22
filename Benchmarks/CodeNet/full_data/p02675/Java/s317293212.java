import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String hon = "24579";
        String pon = "0168";
        
        String N;
        N = new Scanner(System.in).next();

        String s = String.valueOf(N.charAt(N.length() - 1));

        if (hon.contains(s)){
            System.out.println("hon");
        }
        if (pon.contains(s)){
            System.out.println("pon");
        }
        if (N == "3") System.out.println("bon");
    }
}
