// 提出時に消す


import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (s.equals(t.substring(0, s.length())) && (t.length() - s.length() == 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}