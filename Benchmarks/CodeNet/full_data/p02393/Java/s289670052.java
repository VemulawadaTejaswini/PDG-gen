import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        if (a > b){
            a ^= b ^= a;
        }
        if (b > c){
            b ^= c ^= b;
        }
        if (a > b){
            a ^= b ^= a;
        }

        System.out.println(a + " " + b + " " + c);
    }
}