import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long r = 1;
        for (int i = 0; i < n; i++) {
            r = r * sc.nextLong();
        }
        if(r > 1000000000000000000L || r < 0){
            r = -1;
        }
        System.out.println(r);
    }
}