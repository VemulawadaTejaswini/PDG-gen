import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int list[]  = new int[n];
		int sum = 0;
		boolean flag = true;

		for(int i=0; i < n; i++){
			list[i] = scan.nextInt();
			sum += list[i];
		}
		int line = sum / (4 * m);
		Arrays.sort(list);
		int j =  n - 1;
		for(int i=0; i< m; i++){
			if(line > list[j]) flag = false;
			j --;
		}

		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}