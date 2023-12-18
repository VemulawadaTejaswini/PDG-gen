import java.util.Scanner;

public class Main {
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        if(s.matches("hi")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}