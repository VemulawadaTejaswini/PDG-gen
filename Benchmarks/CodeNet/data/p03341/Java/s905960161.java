import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        char[] input = scan.next().toCharArray();

        // search
        int[] west = new int[NUM+1];
        int[] east = new int[NUM+1];
        for(int i = 0; i < NUM; i++){
            west[i+1] += west[i];
            if(input[i] == 'W'){
                west[i+1] += 1;
            }
            east[i+1] += east[i];
            if(input[i] == 'E'){
                east[i+1] += 1;
            }

        }
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < NUM; i++){
            int temp = west[i] + east[NUM] - east[i + 1];
            if(temp < answer){
                answer = temp;
            }
        }

        // answer
        System.out.println(answer);


    }
}