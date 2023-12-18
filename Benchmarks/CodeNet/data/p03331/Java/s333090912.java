import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int l = (int) Math.ceil(n/2.0);
        int r = n /2;
        int min = Integer.MAX_VALUE;
        for (int i = l; i > 0 ; i--) {
            min = Math.min(min, getSumDigits(i) + getSumDigits(r));
            r++;
        }
        System.out.println(min);
    }

    public static int getSumDigits(int num){
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return  sum;
    }
}
