import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] cost = new int[n];
        int[] time = new int[n];
        for(int i = 0; i < n; i++){
            cost[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        int mincos = 1001;
        for(int i = 0; i < n; i++){
            if(time[i] <= t && cost[i] < mincos){
                mincos = cost[i];
            }
        }
        if(mincos == 1001){
            System.out.print("TLE");
        } else {
            System.out.print(mincos);
        }
    }
}