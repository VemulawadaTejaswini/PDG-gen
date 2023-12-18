import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100001];
        for (int i=0;i<n;i++){
            a[scanner.nextInt()]++;
        }
        int max = 0;
        for (int i=1;i<n-1;i++){
            max = Math.max(max,a[i-1]+a[i]+a[i+1]);
        }
        System.out.println(max);
        
    }

}