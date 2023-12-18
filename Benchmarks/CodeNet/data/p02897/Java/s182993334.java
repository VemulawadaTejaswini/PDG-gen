import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        double n = yomi.nextInt();
        if (n%2==0){
            double a=(n/2.0)/n;
            System.out.println(a);
        }else {
            double a=((n/2)+1)/n;
            System.out.println(a);
        }

    }
}
