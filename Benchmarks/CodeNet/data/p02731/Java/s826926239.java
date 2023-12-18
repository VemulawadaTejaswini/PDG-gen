
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double d = sc.nextInt();
        d /= 3;
        System.out.println(String.format("%f", d * d * d));
    }
}