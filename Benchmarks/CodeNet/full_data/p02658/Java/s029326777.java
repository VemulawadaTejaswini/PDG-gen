import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		long ans = 1;
		for(int i = 0;i < n; ++i){
			long a = Long.parseLong(scan.next());
			if(a*ans < 0 || a*ans >1000000000000000000L){
				ans = -1;
			}else if (ans != -1 || a == 0){
				ans *= a;
			}
		}
		System.out.print(ans);
	}
}