import java.util.*;

public class Main
{
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 1; i < 100; i++) {
//            System.out.println(solve(i));
//        }
        System.out.println(solve(n));

    }
    public static int solve(int c){
        int min_step = (int) ((-1 + Math.sqrt(1 + 8*c) ) / 2);
        if (min_step * (min_step + 1) < 2 * c){
            min_step += 1;
        }
        return min_step;
    }


}