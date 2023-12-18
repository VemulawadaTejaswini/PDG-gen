import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        int[] value = new int[elements];
        int[] cost  = new int[elements];
        
        for(int i=0; i<elements; i++){
            value[i] = sc.nextInt();
        }
        for(int i=0; i<elements; i++){
            cost[i] = sc.nextInt();
        }
        int max = 0;
        int profit = 0;
        for(int i=0; i<elements; i++){
            profit = value[i] - cost[i];
            if(profit>0){
                max += profit;
            }
        }
        System.out.println(max);
    }
}