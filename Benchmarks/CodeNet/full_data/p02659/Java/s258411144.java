import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int b = (int)(sc.nextDouble()*100);
        System.out.println(a*b/100);
    }
}
