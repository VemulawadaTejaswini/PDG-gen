import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        while(a >= 0 || c >= 0){
            c = c - b;
            if(c <= 0){
                System.out.println("Yes");
                break;
            }
            a = a - d;
            if(a <= 0){
                System.out.println("No");
                break;
            }
        }
    }
}