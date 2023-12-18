import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = 0;

        if(N % 2 == 0) {
            tmp = N / 2;
        } else tmp = N / 2 + 1;

        System.out.println((double)tmp / N);       
    }
}