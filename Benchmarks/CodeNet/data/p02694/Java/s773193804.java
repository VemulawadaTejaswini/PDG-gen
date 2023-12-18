import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long num = 100;
        int count = 0;
        while(num < x){
            count ++;
            double t = num * 1.01;
            num = (long)t;
        }
        System.out.println(count);
    }
}