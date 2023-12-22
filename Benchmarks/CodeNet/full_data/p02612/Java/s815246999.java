import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] price = sc.next().split("");
        
        if (Integer.parseInt(price[1]) == 0) System.out.println(0);
        else System.out.println(10 - Integer.parseInt(price[1]));
    }
}