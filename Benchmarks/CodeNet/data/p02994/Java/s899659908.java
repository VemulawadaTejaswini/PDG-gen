import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        LinkedList<Integer> scores = new LinkedList<>();
        int delicious = scan.nextInt();
        for(int i = 0; i < NUM; i++){
            scores.add(delicious + (i + 1) - 1);
        }

        // search
        int sum = 0;
        Collections.sort(scores, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
        scores.poll();
        for(int i = 1; i < NUM; i++){
            sum += scores.poll();
        }

        // answer
        System.out.println(sum);


    }
}