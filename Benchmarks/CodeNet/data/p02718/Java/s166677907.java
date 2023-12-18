import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        ArrayList<Integer> list= new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            sum += A[i];
            list.add(A[i]);
        }

        Collections.sort(list);

        if(list.get(N - M)>=sum/4.0/M){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}