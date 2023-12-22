import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            String op = sc.next();
            int n = sc.nextInt();
            if(((String) op).equals("+")) {
                System.out.println(m + n);
            }
            if(((String) op).equals("-")) {
                System.out.println(m - n);
            }
            if(((String) op).equals("*")) {
                System.out.println(m * n);
            }
            if(((String) op).equals("/")) {
                System.out.println(m / n);
            }
            if(((String) op).equals("?")) {
                break;
            }
        }
    }
}
