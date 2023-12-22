import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int [a];
        for(int i = 0; i < a ; i++) {
            b[i] = sc.nextInt();
        }
        for(int i = a - 1; i > -1; i--) {
            if(i == 0) {
                System.out.println(b[i]);
            } else {
                System.out.print(b[i] + " ");
            }
        }
    }
}
