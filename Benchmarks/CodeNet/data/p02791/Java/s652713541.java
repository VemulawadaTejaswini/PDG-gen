import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] p = new int[n];
      
        for (int i=0; i < n; i++) {
            p[i] = sc.nextInt();
        }
      
        int cnt = 1;
        int min = p[0];
      
        for (int i = 1; i < n; i++) {
            if (min > p[i]) {
                min = p[i];
                cnt++;
            }
        }
        
        System.out.println(cnt);
        
	}
}