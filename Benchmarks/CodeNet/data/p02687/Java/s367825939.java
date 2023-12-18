import java.util.Scanner;

class ABC166_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        if (S.equals("ABC")) {
            System.out.println("ARC");
        } else if (S.equals("ARC")) {
            System.out.println("ABC");
        }   
    }
}