import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        int[] stairs = new int[NUM+1];
        for(int i = 0; i < NUM; i++){
            stairs[i] = scan.nextInt();
        }
        stairs[NUM] = Integer.MAX_VALUE;

        // search
        for(int i = 0; i < NUM - 1; i++){
            if(stairs[i] > stairs[i + 1]){
                stairs[i] -= 1;
            }
        }

        // answer
        String answer = "Yes";
        for(int i = 0; i < NUM - 1; i++){
            if(stairs[i] > stairs[i + 1]){
                answer = "No";
            }
        }
        System.out.println(answer);


    }
}