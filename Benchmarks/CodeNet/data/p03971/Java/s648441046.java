import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();

        char[] s = S.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'a') {
                if (A + B > 0) {
                    System.out.println("Yes");
                    if (A > 0) {
                        A--;
                    } else {
                        B--;
                    }
                } else {
                    System.out.println("No");
                }
            } else if (s[i] == 'b') {
                if (A + B > 0) {
                    if (B > 0) {
                        System.out.println("Yes");
                        B--;
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}