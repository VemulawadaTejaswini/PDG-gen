import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;

        if(n > 1){
            sum += n * (n - 1) / 2;
        }
        if(m > 1){
            sum += m * (m -1) / 2;
        }
        System.out.println(sum);
    }
}