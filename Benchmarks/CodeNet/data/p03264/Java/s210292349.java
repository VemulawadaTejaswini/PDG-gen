import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double K = sc.nextInt();
        int count = 0;
        for(double i = 1; i<=K; i++){
            count += Math.ceil((K - i)/2);
        }
        System.out.print(count);
    }
}
