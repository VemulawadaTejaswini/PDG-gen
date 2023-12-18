import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] A = new int[n];
        
        for(int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }
        
        A[0] = 4;
        
        int x;
        int y;
        if (A[0] > A[1]) {
            x = A[0];
            y = A[1];
        } else {
            x = A[1];
            y = A[0];
        }
        
        //最大公約数
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }

        System.out.println(y);
    }
}
