import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int n = 0;
        int i = 1;
        while (X >= n) {
            n = n + i;
            i++;
        }
        
        System.out.println(i);

    }


}