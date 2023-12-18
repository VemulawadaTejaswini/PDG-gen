import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String s = sc.nextLine();
        
        int n = Integer.parseInt(a);
        
        if (n < 3200) {
            System.out.println("red");
        } else {
            System.out.println(s);
        }
    }
}