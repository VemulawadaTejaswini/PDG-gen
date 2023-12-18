import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer a[] = new Integer[N];
        for (int i=0; i<N-1; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        
        Integer res[] = new Integer[N];
        
        for (int i = 1; i < N; i++){
            res[a[i] - 1]++;
        }
      
	    for (int i = 0; i < N; i++){
            System.out.println(res[i]);
        }
    }
}