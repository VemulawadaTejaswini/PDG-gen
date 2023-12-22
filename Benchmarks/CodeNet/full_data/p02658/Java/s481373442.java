import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = sc.nextLong();;

        for(int i = 0; i < n - 1; i++) {
        	sum *= sc.nextLong();
        }

        if(sum > 1000000000000000000L) {
        	sum = -1;
        }

        System.out.println(sum);

    }
}