import java.util.*;
import java.text.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0) break;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int sum = 0;
			for(int i=0; i<n; i++){
				int d = in.nextInt();
				sum += d;
				if(max<d) max = d;
				if(min>d) min = d;
			}
			System.out.println((sum-max-min)/(n-2));
		}
	}
}