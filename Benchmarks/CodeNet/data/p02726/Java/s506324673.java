import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int[] dis = new int[n];
        for(int i=1; i<=n; i++) {
            for(int j=i+1; j<=n; j++) {
                int s = min(j-i, min(sa(x, i)+1+sa(y, j), sa(y, i)+1+sa(x, j)));
                dis[s]++;
            }
        }
        for(int i=1; i<n; i++) {
            System.out.println(dis[i]);
        }
        
    }
    
    public static int min(int a, int b) {
        if(a <= b) return a;
        else return b;
    }
    static int sa(int a, int c) {
        if(a <= c) return c-a;
        else return a-c;
    }
}