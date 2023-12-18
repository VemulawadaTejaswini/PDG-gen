import java.util.Scanner;

class atcoder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number u want");
        int n = input.nextInt();
        int c = 1000 - n;
        c = c+110;
        System.out.println(c);
    }
}