import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i = a; i <= b; i++){
            if(i % k == 0){
                System.out.println("OK");
                System.exit(0);
            }
        }
        System.out.println("NG");
    }
}