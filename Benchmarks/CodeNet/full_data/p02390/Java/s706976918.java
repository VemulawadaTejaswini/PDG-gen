import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            int x = scanner.nextInt();

    System.out.println( x/3600 + ":" + x%3600/60 + ":" + x%3600%60);

    }

}