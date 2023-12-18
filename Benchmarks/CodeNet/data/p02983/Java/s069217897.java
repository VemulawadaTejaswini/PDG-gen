import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int lm = l % 2019;
        int rm = r % 2019;

        if(lm < rm){
            if(l + (2019-lm) <= r){
                System.out.println("0");
            } else {
                System.out.println((lm * (lm+1)) % 2019);
            }
        } else{
            System.out.println("0");
        }
    }
}

