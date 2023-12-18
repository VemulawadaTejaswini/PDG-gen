import java.util.Scanner;

class Rp1ABC098A {
    public static void main(String args[]) {



        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();

        int A = result;

        result = scanner.nextInt();
        int B = result;

        int sum = A + B;
        int difference = A - B;
        int product = A * B;

        int max = sum;
        if(difference > max) max = difference;
        if(product > max) max = product;

        System.out.println(max);


        return;
    }
}