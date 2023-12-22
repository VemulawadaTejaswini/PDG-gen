import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num = 0;

        if(N % 1000 != 0) {
        	num = 1000 - N % 1000;
        }

        System.out.println(num);

    }
}