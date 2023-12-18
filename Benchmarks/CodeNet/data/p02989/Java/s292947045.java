
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        for(int i=0;i<n;i++){
            d[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(d);
        sc.close();
        int lower = d[n/2-1];
        int higher = d[n/2];
        System.out.println(higher-lower);
    }
}