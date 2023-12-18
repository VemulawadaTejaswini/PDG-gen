import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        int[] town = new int[NUM+1];
        int[] hero = new int[NUM];
        for(int i = 0; i < NUM + 1; i++){
            town[i] = scan.nextInt();
        }
        for(int i = 0; i < NUM; i++){
            hero[i] = scan.nextInt();
        }

        // search
        long sum = 0;
        int temp = Math.min(town[0], hero[0]);
        town[0] -= temp;
        hero[0] -= temp;
        sum += temp;
        for(int i = 1; i < NUM; i++){
            temp = Math.min(town[i], hero[i - 1]);
            town[i] -= temp;
            hero[i - 1] -= temp;
            sum += temp;
            temp = Math.min(town[i], hero[i]);
            town[i] -= temp;
            hero[i] -= temp;
            sum += temp;
        }
        temp = Math.min(town[NUM], hero[NUM - 1]);
        town[NUM] -= temp;
        hero[NUM - 1] -= temp;
        sum += temp;

        // answer
        System.out.println(sum);


        
    }
}