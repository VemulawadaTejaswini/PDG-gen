import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] subordinate = new int[N];
        Arrays.fill(subordinate,0);
        for(int i = 1; i < N; i++){
            subordinate[in.nextInt()-1] += 1;
        }
        for(int i = 0; i < N; i++){
            System.out.println(subordinate[i]);
        }
    }

}
