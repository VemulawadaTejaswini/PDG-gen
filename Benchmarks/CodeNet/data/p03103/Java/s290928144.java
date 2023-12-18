import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        int goal = scan.nextInt();
        int[][] shop = new int[NUM][2];
        for(int i = 0; i < NUM; i++){
            shop[i][0] = scan.nextInt();
            shop[i][1] = scan.nextInt();
        }

        // sort
        Arrays.sort(shop, (a, b) -> Integer.compare(a[0], b[0]));

        // search
        long money = 0;
        for(int i = 0; i < NUM; i++){
            if(shop[i][1] < goal){
                goal -= shop[i][1];
                money += shop[i][0] * shop[i][1];
                shop[i][1] = 0;
            } else {
                while(goal > 0){
                    goal -= 1;
                    money += shop[i][0];
                    shop[i][1] -= 1;
                }
            }
            if(goal <= 0){
                break;
            }
        }

        // answer
        System.out.println(money);

    }
}