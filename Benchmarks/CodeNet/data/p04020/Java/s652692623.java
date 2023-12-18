import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
		sc.close();
        
        long ans = a[0] / 2;
        a[0] -= ans * 2;
        for(int i=1; i<n; i++){
            int tmp = (a[i] + a[i-1]) / 2;
            a[i] -= tmp * 2;
            ans += tmp;
            if(a[i] < 0) a[i]++;
        }
        System.out.print(ans);
	}
}