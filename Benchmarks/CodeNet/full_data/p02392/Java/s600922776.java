import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result;
        if (a < b && b < c) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println(result);
    }
}