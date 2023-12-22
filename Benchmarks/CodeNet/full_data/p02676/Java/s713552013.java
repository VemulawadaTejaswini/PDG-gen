
import java.util.Scanner;

public class Main {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int k = sc.nextInt();
        String s = sc.next();

        if (k >= s.length()){
            System.out.println(s);
        }else {
            StringBuilder sb = new StringBuilder(s);
            String tmp = sb.substring(0,k);
            sb = new StringBuilder(tmp);
            sb.append("...");
            System.out.println(sb);
        }
    }
}
