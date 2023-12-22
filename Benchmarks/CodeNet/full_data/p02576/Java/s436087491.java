import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int t = sc.nextInt();

        int times = (int)Math.ceil((double)N/X);
        System.out.println(times * t);
    }
}