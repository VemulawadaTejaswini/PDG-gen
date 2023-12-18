import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */

public class Main {
    // calc the index where array[i] is minimum of array, except [currentIndex]
    public static void open(LinkedList<Integer> operations, int boxes, int current, int end){
        for(int b=0; b<boxes; b++) if(b!=current && b!=end) operations.addLast(b+1); // 1-index
        operations.add(end+1);
    }
    public static void open(LinkedList<Integer> operations, int boxes, int end){
        open(operations, boxes, -1, end);
    }

    public static int minIndex(int[] array, int currentIndex){
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0; i<array.length; i++){
            if(i!=currentIndex && array[i]<min){
                min = array[i];
                ans = i;
            }
        }
        return ans;
    }
    public static int minIndex(int[] array){
        return minIndex(array, -1);
    }

    public static void impossible(){
        System.out.println(-1);
        System.exit(0);
    }
    public static void possible(LinkedList operations){
        System.out.println(operations.size());
        while(!operations.isEmpty()){
            System.out.print(operations.pop());
            if(operations.isEmpty()) System.out.println();
            else System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int n=0; n<N; n++) A[n] = sc.nextInt();

        LinkedList<Integer> operations = new LinkedList<>();
        int current = -1;
        for(int k=0; k<=K; k++){
            int end = minIndex(A, current);
            open(operations, N, current, end);
            for(int n=0; n<N; n++) if(n!=current) {
                A[n]--;
                if(A[n]<0) impossible();
            }
            current=end;
        }

        possible(operations);

    }
}
