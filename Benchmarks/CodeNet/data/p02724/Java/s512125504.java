import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int temp;
        int temp2;
        int temp3;

        if( X % 5 == 0) {
            System.out.println(X*2);
        } else if (X % 5 != 0) {
            temp = X - (X%5);
            temp2 = (temp / 500) * 1000;
            temp3 = temp % 500;
            System.out.println(temp2 + temp3);
        }
    }
}