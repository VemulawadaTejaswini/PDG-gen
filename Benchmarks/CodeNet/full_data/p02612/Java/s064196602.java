import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int mai = N/1000;
        int change = 0;
        if (N%1000 != 0) {
            change = 1000*mai + 1000 - N;
        } else {
            change = 1000*mai  - N;
        } 
        System.out.println(change);
    }
}