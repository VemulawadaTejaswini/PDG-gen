import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt(),z = 0;
        while(true){
            c -= b;
            a -= d;
            if(c <= 0) {
                System.out.println("Yes");
                System.exit(0);
            }if(a <= 0){
                System.out.println("No");
                System.exit(0);
            }
        }
    }
}
