import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String SList = sc.next();
        String r = "";
        for (char s:
             SList.toCharArray()) {
            s += N;
            if ('Z' < s) s -= 26;
            r += (char)(s);
        }
        System.out.println(r);
    }
}