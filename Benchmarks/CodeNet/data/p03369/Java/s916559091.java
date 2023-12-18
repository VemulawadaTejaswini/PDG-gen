import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        long n = s.chars().filter(x -> x == 'o').count();
        System.out.println(700 + n * 100);
    }
}

