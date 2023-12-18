import java.util.Scanner;

public class Main {
    static int SumOfDegits(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            int digitsSum = SumOfDegits(i);
            if(digitsSum >= A && digitsSum <= B) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}