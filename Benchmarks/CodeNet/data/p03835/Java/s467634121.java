import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int target = scanner.nextInt();
        int count = 0;

        for(int i=0; i<=limit; i++) {
            for(int j=0; j<=limit; j++) {
                if(target - i - j <= limit) {
                    if(target == i + j + (target-i-j)) {
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
