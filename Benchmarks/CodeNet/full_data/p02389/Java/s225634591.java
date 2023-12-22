import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    int j = scan.nextInt();

    System.out.print((i+j)*2);
    System.out.print(" ");
    System.out.print(i*j);
}

}