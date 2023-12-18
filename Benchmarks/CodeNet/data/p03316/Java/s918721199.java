import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int digitSum = 0;

        int temp = N;
        while(temp != 0){
            digitSum = digitSum + temp % 10;
            temp = temp /10;
        }
        System.out.println( N % digitSum == 0 ? "Yes" : "No");
    }

}
