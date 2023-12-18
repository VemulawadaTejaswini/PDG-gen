import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			List<Integer> list = new LinkedList<Integer>(n);
			for (int i = 1; i <= n; i++) {
				if(isEven(i)){
					list.add(0,sc.nextInt());
				}else{
					list.add(sc.nextInt());
				}
			}

			if(isEven(n)){
				for (int i = 0; i < n; i++) {
					System.out.print(list.get(i)+ " ");
				}
			}else{
				for (int i = 0; i < n; i++) {
					System.out.print(list.get(list.size()-1-i)+" ");
				}
			}

		    sc.close(); }

	public static boolean isEven(int n ) {
		if (n % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
}
