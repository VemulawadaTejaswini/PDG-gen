import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.nextLine();
        int[] x = new int[n];
        int[] y = new int[m];
        for (int i=0;i < n ;i++ ) {
            x[i] = Integer.parseInt(sc.next());
        }
        for (int i=0;i < m ;i++ ) {
            y[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(x);
        Arrays.sort(y);
        
        if (x[n-1]<y[0]) {
            System.out.println("No War");
        }else{
            System.out.println("War");
        }
    }
}