import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String[] a = n.split("");
        if ((a[0].equals(a[1]) && a[1].equals(a[2])) || (a[1].equals(a[2]) && a[2].equals(a[3])))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}