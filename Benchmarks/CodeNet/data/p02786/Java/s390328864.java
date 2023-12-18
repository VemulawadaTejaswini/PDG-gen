import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        if(H == 0){
            System.out.println(H);
            System.out.println(0);
            return;
        }
        long count = Main.countMaxMonster(H);
        System.out.println(count);
    }

    public static long countMaxMonster(long H){
        if(H == 1) return 1;
        long count = Main.countMaxMonster(H / 2 )* 2 + 1 ;
        return count;
    }

}