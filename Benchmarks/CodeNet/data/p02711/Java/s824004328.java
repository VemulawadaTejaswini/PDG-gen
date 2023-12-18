import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == '7') {
                flag = true;
                System.out.println("Yes");
                break;
            }
        }
        if (!flag) {
            System.out.println("No");
        }
    }
}