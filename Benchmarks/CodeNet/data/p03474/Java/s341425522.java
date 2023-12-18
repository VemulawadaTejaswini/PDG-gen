import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String s = sc.next();
        
        for (int i = 0; i < a; i++) {
            if (s.charAt(i) == '-') {
                print("No");
                return;
            }
        }
        
        if (s.charAt(a) != '-') {
            print("No");
            return;
        }
        
        for (int i = a + 1; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                print("No");
                return;
            }
        }        
        print("Yes");
    }
    
    static void print(String str) {
        System.out.println(str);
    }
}