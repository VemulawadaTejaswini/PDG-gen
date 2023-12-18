import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int max = a[n-1];
        int half = (max+1)/2;
        int dist = Integer.MAX_VALUE;
        int pair = 0;
        for(int i = 0; i < n; i++) {
        	if( Math.abs(half-a[i]) < dist) {
        		dist = Math.abs(half-a[i]);
        		pair = a[i];
        	}
        }
        System.out.println(max+" "+pair);
    }
}