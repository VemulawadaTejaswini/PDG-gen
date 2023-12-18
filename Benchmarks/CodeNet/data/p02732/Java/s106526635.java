import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A  = new int[N];
        int[] numCount = new int[200001];
        long totalComb = 0;


        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            numCount[A[i]]++;
            totalComb += numCount[A[i]]-1;
        }


        for(int i=0;i<N;i++){
            System.out.println(totalComb-(numCount[A[i]]-1));
        }


    }

}







