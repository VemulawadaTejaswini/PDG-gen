import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int result = N % (A + B);
        int i = N / (A + B) * A;

        i = result + i;

        System.out.println(i);
    }
}