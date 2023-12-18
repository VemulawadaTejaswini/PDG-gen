import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split("");
        String[] b = scanner.nextLine().split("");
        String[] c = scanner.nextLine().split("");
        System.out.println(a[0] + b[1] + c[2]);
    }
}
