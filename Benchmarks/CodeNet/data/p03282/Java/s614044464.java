import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String k = sc.next();
        int count = 0;
        for(char c: s.toCharArray()) {
            count++;
            if(c != '1') {
                System.out.println(c);
                return;
            }
            if(k.length() <= 3 && Integer.parseInt(k) == count) {
                System.out.println(c);
                return;
            }
        }
    }
}
