import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner();
        int a = s.nextInt(), b = s.nextInt();

        if ((a * b) % 2 == 0) {
          System.out.println("Even");
        } else {
          System.out.println("Odd");
        }
    }
}
