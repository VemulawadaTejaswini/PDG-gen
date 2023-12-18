import java.util.Scanner;
class main {
    public static void main(String[] args) {
        final Scanner n = new Scanner(System.in);
        
        String a = n.next().equals("ABC") ? "ARC" : "ABC";
        
        System.out.println(a);
        n.close();
    }
}