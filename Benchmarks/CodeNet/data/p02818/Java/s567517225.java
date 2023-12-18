import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long takahashi = scanner.nextLong();
        long aoki = scanner.nextLong();
        long takahashikaisuu = scanner.nextLong();

        for (long i = 0; i < takahashikaisuu; i++){
            if (takahashi >=1){
                takahashi--;
            }
            else if (aoki >= 1){
                aoki--;
            }
        }
        System.out.println(takahashi + " " + aoki );
    }
}
