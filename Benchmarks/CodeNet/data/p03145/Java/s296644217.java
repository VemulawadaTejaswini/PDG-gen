import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int[] edge = new int[3];
        for(int i = 0; i < 3; i++){
            edge[i] = scan.nextInt();
        }

        // sort
        Arrays.sort(edge);

        // answer
        System.out.println(edge[0] * edge[1] / 2);
        
        

    }
}