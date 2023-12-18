import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long sum = 100;
        long year = 0;
        while(sum < x) {
            year++;
            sum *= 1.01;
        }
        
        System.out.println(year);
    }
}