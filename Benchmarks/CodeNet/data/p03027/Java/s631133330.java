import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int Q = Integer.parseInt(sc.next());
		long MOD = 1_000_003L;
		for(int i=0; i<Q; i++){
			long ans = 1;
			long x = Long.parseLong(sc.next());
			long d = Long.parseLong(sc.next());
			long n = Long.parseLong(sc.next());
			if (n>=MOD){
				ans = 0;
				System.out.println(ans%MOD);
				continue;
			}
			
			for(long j=0; j<n; j++){
				long tmp = x + j*d;
				
				if(tmp%MOD == 0){
					ans = 0;
					break;
				}
				ans = (ans*tmp)%MOD;
			}
			System.out.println(ans);
		}
		

		

		//int Q = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();

	}
	

	
}

