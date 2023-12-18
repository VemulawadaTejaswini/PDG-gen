import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numA = scanner.nextLine();
        String numB = scanner.nextLine();
        final int num = Integer.parseInt(numA + numB);

        for(int i=0; i<num; i++) {
            if(i*i==num) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        return;
    }
}
