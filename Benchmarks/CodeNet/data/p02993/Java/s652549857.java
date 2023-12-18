import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 10;
        while(n != 0){
            if(n % 10 == x){
                System.out.println("Bad");
                return;
            }
            x = n % 10;
            n /= 10;
        }

        System.out.println("Good");

    }
}
