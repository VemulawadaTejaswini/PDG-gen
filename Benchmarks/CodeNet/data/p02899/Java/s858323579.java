import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] x = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            list.add(A[i]);
            x[A[i]-1] = i+1;
        }

        Collections.sort(list);

        for(int i=0; i<N; i++){
            System.out.print(x[list.get(i)-1] + " ");
        }
    }
}