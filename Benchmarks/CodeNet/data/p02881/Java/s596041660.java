import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        boolean b = true;
        for (long i = (long)Math.sqrt(num);i>0&&b;i--){
            if (num%i==0){
                System.out.println(i+num/i-2);
                b = false;
            }
        }
    }

}