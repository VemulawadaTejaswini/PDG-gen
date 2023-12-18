import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a[] = new int[26];
        for (int i=0; i<s.length(); i++) {
            a[s.charAt(i)-'a']++;
            if (a[s.charAt(i)-'a'] > 1) {
                System.out.println("no");
                sc.close();
                return;
            }
        }
        System.out.println("yes");
        sc.close();
    }
}