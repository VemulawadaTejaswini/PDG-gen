import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if (a.length() < b.length()) {
            System.out.println("LESS");
        } else if (a.length() > b.length()) {
            System.out.println("GREATER");
        } else {
            for (int i = 0; i < a.length(); ++i) {
                if (a.charAt(i) < b.charAt(i)) {
                    System.out.println("LESS");
                    return;
                } else if (a.charAt(i) > b.charAt(i)) {
                    System.out.println("GREATER");
                    return;
                }
            }
            System.out.println("EQUAL");
        }
    }
}