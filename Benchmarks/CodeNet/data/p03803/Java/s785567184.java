import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = a==1 ? 14 : a;
        int b = sc.nextInt();
        b = b==1 ? 14 : b;
        if(a==b)
        System.out.println("Draw");
        else if(a>b)
        System.out.println("Alice");
        else
        System.out.println("Bob");
    }
}