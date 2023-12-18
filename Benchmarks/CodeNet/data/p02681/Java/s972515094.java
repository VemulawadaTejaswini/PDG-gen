import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String z = sc.next();
        if(z.startsWith(s) && z.length() - 1 == s.length())
        {
        System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}