import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            float i = ((float)a / b);
            System.out.println((a / b)  + " " + (a % b) + " " + i );
    }
}