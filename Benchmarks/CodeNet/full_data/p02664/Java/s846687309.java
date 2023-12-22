import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String t = sc.next();
        StringBuilder sb = new StringBuilder(t);
        for (int i = 0; i < t.length(); i++){
            if (t.charAt(i) == '?'){
                sb.setCharAt(i, 'D');
            }
        }

        System.out.println(sb);
    }
}