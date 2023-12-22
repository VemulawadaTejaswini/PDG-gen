import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        if(a<b&&b<c) System.out.println("Yes");
        else System.out.println("No");
    }
}