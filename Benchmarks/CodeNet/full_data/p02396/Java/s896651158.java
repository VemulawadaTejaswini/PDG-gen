import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int i=0;
        while(true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            System.out.printf("Case %d: %d\n", ++i, num);
        }
    }
}
