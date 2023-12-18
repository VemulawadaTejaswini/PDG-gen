import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long h = scan.nextLong();
        long w = scan.nextLong();

        System.out.println((h*w)/2);
    }
}