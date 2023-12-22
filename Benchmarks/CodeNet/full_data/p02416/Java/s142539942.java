import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x == 0) {
                break;
            } else {
                int y = 0;
                for (int i = 0; i < 100; i++) {
                    int z = x%10;
                    y = y + z;
                    x = x/10;
                    if(x == 0){
                        break;
                    }
                }
                System.out.printf("%d\n", y);
            }
        }
    }
}

