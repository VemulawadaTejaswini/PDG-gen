import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int a = t.nextInt();
        int b = t.nextInt();
        int x = t.nextInt();
        
        int sum = 0;
        for (int i = a; i <= x; i+=a) {
            sum+=b;
        }
        System.out.println(sum);
    }   
}
