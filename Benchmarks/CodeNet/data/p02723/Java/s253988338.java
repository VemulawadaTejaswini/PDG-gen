import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s3 = s.substring(2,3);
        String s4 = s.substring(3,4);
        String s5 = s.substring(4,5);
        String s6 = s.substring(5,6);
        if (s3.equals(s4) && s5.equals(s6))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}