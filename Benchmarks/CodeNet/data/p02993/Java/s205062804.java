import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
    }
}