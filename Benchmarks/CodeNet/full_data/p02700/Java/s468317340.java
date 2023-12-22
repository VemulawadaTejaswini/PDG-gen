import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        for(int i = 0; i < 1000; i++){
            if(i % 2 == 0){
                c -= b;
                if(c <= 0){
                    System.out.println("Yes");
                    System.exit(0);
                }
            }else{
                a -= d;
                if(a <= 0){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
    }
}