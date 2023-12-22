import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = (long)(sc.nextDouble()*100);
        String s = Long.toString(a*b);
        System.out.println(s.substring(0,s.length()-2));
    }
}
