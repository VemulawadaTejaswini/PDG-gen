import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        S = S.replaceAll("B", "");
        if (S.length() == 0 || S.length() == 3) 
            System.out.println("No");
        else 
            System.out.println("Yes");
    }
}