
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int c , ti;

        int min_cost = 1001;

        for(int i = 0;i < n;i++){
            c = sc.nextInt();
            ti = sc.nextInt();

            if(ti <= t && c <min_cost){
                min_cost = c;
            }
        }

        if(min_cost == 1001){
            System.out.println("TLE");
        }else{
            System.out.println(min_cost);
        }

    }
}