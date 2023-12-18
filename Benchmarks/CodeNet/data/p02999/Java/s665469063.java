import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int A = scanner.nextInt();

        if(X < A){
            System.out.println(0);
        }else{
            System.out.println(10);
        }
    }
}