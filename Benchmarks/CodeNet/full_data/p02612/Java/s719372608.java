import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        // String s = sc.next();
        // long l = sc.nextLong();
        if(d >= 1000) {
            d = d % 1000;
        }
        System.out.println(1000-d);
    }
}
