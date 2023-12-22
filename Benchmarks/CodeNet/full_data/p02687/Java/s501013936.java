import java.util.Scanner;
class main {
    public static void main(String[] args) {
        final Scanner n = new Scanner(System.in);
        
        String a = n.next();

        if (a.equals("ABC")) {
            System.out.println("ARC");
        } else {
            System.out.println("ABC");
        }
        n.close();
    }
}