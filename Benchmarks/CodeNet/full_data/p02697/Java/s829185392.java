import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int half = n / 2;
        for(int i = m; i > 0; i--){
            if(i % 2 == 0){
                System.out.println(String.format("%d %d", half - i, half));
                half--;
            } else {
                System.out.println(String.format("%d %d", n - i, n));
                n--;
            }
        }
    }
}