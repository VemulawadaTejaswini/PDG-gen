import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i=0;i<n;i++)h[i] = Integer.parseInt(sc.next());
        Arrays.sort(h);
        int min = Integer.MAX_VALUE;
        for(int i=0;i+k-1<n;i++){
            min = Math.min(min,h[i+k-1]-h[i]);
        }
        System.out.println(min);
        sc.close();
    }
    
}