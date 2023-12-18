import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N_pathCount = Integer.parseInt(scan.next());
        int T_timeLimit = Integer.parseInt(scan.next());

        int minCost = 999999999;
        for(int i = 0; i < N_pathCount; i++){
           int cost = Integer.parseInt(scan.next());
           int time = Integer.parseInt(scan.next());

           if(time <= T_timeLimit){
               if(cost < minCost) minCost = cost;
           }
        }

        if(minCost == 999999999) {
            System.out.println("TLE");
        }else{
            System.out.println(minCost);
        }
    }
}