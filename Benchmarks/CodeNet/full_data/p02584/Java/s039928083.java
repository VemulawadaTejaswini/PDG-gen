
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(), k = sc.nextLong(), d = sc.nextLong();
        boolean isEven = k % 2 == 0;
        if(isEven){
            System.out.println(Math.min(Math.abs(x), Math.abs(x-d*2)));
        }else{
            System.out.println(Math.min(Math.abs(x+d), Math.abs(x-d)));
        }
    }
}
