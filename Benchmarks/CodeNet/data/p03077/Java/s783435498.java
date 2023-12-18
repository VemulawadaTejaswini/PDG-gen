import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] A = new int[5];
        for(int i = 0; i < 5; i++){
            A[i] = sc.nextLong();
        }
        long min = A[0];
        for(int i = 1; i < 5; i++){
            min = Math.min(min, A[i]);
        }
        if(N%min == 0)
            System.out.println(N/min + 4);
        else
            System.out.println(N/min + 5);
    }
}
