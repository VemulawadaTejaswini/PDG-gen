import java.util.Scanner;
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String numA = scanner.nextLine();
        String numB = scanner.nextLine();
        int num = Integer.parseInt(numA + numB);

        if(num <= 1) {
            System.out.println("No");
            return;
        }
        
        for(int i=0; i<1000; i++) {
            if(i*i==num) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
