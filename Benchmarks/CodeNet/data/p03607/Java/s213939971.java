import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(list.contains(A[i])){
                list.remove(list.indexOf(A[i]));
            }
            else{
                list.add(A[i]);
            }
        }
        System.out.println(list.size());
    }
}