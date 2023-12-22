import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        int cnt = 1;
        char k = 0;
        char l = 0;
        int a2 = 0;
        int b2 = 0;
        List<Character> str = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            str.add(s.charAt(i));
        }
        while (cnt <= q) {
            String order = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            a2 = a;
            b2 = b;
            switch (order) {
                case "print":
                    for (int i = 0; i <= b - a; i++) {
                        System.out.print(str.get(i + a));
                    }   System.out.println("");
                    break;
                case "reverse":
                    for (int i = 0; i < (b - a) / 2 + ((b - a) % 2); i++) {
                        k = str.get(a2);
                        l = str.get(b2);
                        str.set(a2, l);
                        str.set(b2, k);
                        a2++;
                        b2--;
                    }   break;
                default:
                    String p = sc.next();
                    for (int i = 0; i <= b - a; i++) {
                        str.set(a2, p.charAt(i));
                        a2++;
                    }   break;
            }
            cnt++;
        }
    }