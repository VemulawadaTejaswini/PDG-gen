import java.util.*;
import java.io.*;

public class Main {
	public static int dividable (int n){
	    if (n%2 != 0) return 0;
	    else return 1 + dividable(n/2);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int n=0;n<N;n++) a[n]=sc.nextInt();
        
        int ans = 0;
        for(int n=0;n<N;n++) ans += dividable(a[n]);
        System.out.println(ans);
    }
}