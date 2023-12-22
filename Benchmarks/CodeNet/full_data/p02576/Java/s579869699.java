import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), x = sc.nextInt(), t = sc.nextInt();
        int ans = n/x + Math.min(n%x , 1);
        System.out.println(ans*t);
    }    
}