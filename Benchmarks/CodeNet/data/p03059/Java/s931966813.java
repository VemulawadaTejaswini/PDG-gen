import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int T = s.nextInt();
        
        int output = B * (T / A);
        System.out.print(output);
    }
}