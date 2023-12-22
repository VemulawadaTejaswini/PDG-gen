import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        if (k >= s.length()) {
            System.out.println(s);    
        } else {
            System.out.println(s.substring(0, k) + "...");
        }
    }
}
