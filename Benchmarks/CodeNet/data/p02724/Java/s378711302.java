import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int a = 0;
        int b = 0;
        while (x >= 500) {
            x -= 500; 
            a++;
        }
        while (x >= 5) {
            x -= 5;
            b++;
        }
        System.out.println(1000*a + 5*b);
    }
}