import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long D[] = new long[5];
        long N = sc.nextLong();

        D[0] = sc.nextLong();
        D[1] = sc.nextLong();
        D[2] = sc.nextLong();
        D[3] = sc.nextLong();
        D[4] = sc.nextLong();

        long min = N;

        for(int i=0;i<5;i++){
            if(D[i] < min){
                min = D[i];
            }
        }
        if(min >= N){
            System.out.println(5);
        } else if(N % min == 0){
            System.out.println(N / min +4);
        } else {
            System.out.println(N / min + 5);
        }



    }

}
