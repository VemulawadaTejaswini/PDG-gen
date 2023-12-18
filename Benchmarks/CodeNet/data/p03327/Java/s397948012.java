import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num<1000){
            System.out.println("ABC");
        }else {
            System.out.println("ABD");
        }
    }
}

