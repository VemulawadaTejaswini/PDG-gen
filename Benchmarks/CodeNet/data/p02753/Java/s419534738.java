import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        System.out.println( str.matches(".*AB.*|.*BA.*")?"YES":"NO");
    }
}