import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int max = -100000, min = 100000, sum = 0;
        int x;
        int limit = scanner.nextInt();
        for(int i = 0; i < limit; i++){
            x = scanner.nextInt();

            sum += x;
            if(x > max){
                max = x;
            }else if(min > x){
                min = x;
            }
        }

        System.out.printf("%d %d %d\n", min, max, sum);
        scanner.close();
    }
}
