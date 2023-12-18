import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[(n + 1) / 2];
		Arrays.fill(a , 0);
		for(int i = 0 ; i < n ; i++){
			int s = Integer.parseInt(sc.next());
			if(n % 2 != s % 2){
				a[s / 2]++;
			}
		}
		long yono = 0;
		if(n % 2 == 0){
			if(a[0] == a[n / 2 - 1]){
				yono++;
				for(int i = 0 ; i < n / 2 ; i++){
					yono *= 2;
					yono %= 1000000007;
				}
			}
		}else{
			if(a[1] == a[(n - 1) / 2]){
				yono++;
				for(int i = 0 ; i < (n - 1) / 2 ; i++){
					yono *= 2;
					yono %= 1000000007;
				}
			}
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}