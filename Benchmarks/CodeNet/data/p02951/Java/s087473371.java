import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a >= b + c){
            System.out.println(0);
        } else {
            System.out.println(c-(a-b));
        }
    }

}

