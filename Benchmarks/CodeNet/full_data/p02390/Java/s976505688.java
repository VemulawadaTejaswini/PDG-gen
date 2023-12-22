import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long s = in.nextLong();
  
        System.out.printf("%d:%d:%d%n", s / 3600, s / 60 % 60, s % 60);
    }
}