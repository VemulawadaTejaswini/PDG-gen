import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Integer[] A = new Integer[N];
        int result = 0;
        for(int i=0;i<N;i++){
            A[i] = scan.nextInt();
        }
        Arrays.sort(A, Comparator.reverseOrder());
        result += A[0]; 
        for(int i = 2;i<N;i++){
            result += A[i/2];
        }
        System.out.println(result);
    }
}