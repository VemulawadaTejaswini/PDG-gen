import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 100000 || n == 10000 || n == 1000 || n == 100 || n == 10 ){
            System.out.println(10);
        }

        int sum = 0;
        int a = 0;
        while (n > 0){
            a = n % 10;
            n = n / 10;
            sum += a;
        }


        System.out.println(sum);
    }
}
