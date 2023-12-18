
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []b = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		
		boolean jdg = true;
		for(int i = 0 ; i < n-1 ;i++) {
			if(Math.abs(b[i] - b[i+1]) > 1) {
				jdg = false;
				break;
			}
			if(b[0] != 1) {
				jdg = false;
				break;
			}
		}
		
		if(!jdg) {
			System.out.println(-1);
			return ;
		}
		
		List <Integer>[]a = new ArrayList [n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		int g = -1;
		int id = 0;
		
		for(int i = 0 ; i < n ;i++) {
			if(b[i] == 1) {
				g++;
				a[g].add(b[i]);
			}
			else {
				a[g].add(b[i]);
			}
		}
		for(int i = 0 ; i < n ;i++) {
			Collections.sort(a[i]);
		}
		
		for(int i = n-1 ; i >= 0 ; i--) {
			if(a[i].isEmpty()) continue;
			
			for(int num : a[i]) {
				System.out.println(num);
			}
		}
		
		

	}

}
