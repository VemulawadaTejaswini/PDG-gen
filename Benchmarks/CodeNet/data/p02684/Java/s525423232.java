import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long k = scan.nextLong();
		int tele[] = new int[n];
		int act = -1;
		int now = 1;
		ArrayList<Integer> root = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			tele[i] = scan.nextInt();
		}
		
		for(int i=0;i<k;i++) {
			if(root.contains(now)) {
				break;
			}else {
				root.add(now);
				now = tele[now-1];
				act += 1;
			}
		}
		
		k -= act+1;
		
		for(int i=0;i<root.size();i++) {
			int check = root.get(i);
			if(check == now) {
				for(int j=i-1;j>=0;j--) {
					root.remove(j);
				}
				break;
			}
			
		}
		
		long t = k%root.size();
		int ans = root.get((int)t);
		
		
		System.out.println(ans);
		
		
		
		
		
	}	
	
	
	//最小公約数
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
	//入れ替え
	/*
	static int swap (int a, int b) {
		int swap_arr[] = new int[2];
		
		swap[0] = b;
		swap[1] = a;
		
		return swap_arr;
	}
	*/
	
}
