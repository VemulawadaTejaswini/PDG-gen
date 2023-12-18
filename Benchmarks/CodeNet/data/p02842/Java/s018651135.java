import java.util.*;


public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int excludeTax = (int)Math.ceil(Double.valueOf(amount) / 1.08d);
        System.out.println(String.valueOf(excludeTax));
    }
}