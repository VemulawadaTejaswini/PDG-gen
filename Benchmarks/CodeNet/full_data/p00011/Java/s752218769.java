import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] ret = new int[w+1];
		for(int i =0 ; i < w+1; i++) ret[i] = i;
		for(int k = 0;  k< n ; k++){
			String ts = sc.next();
			ts = ts.replace(',', ' ');
			Scanner str = new Scanner(ts);
			int d1 =str.nextInt();
			int d2 =str.nextInt();
			int temp = ret[d1];
			ret[d1] = ret[d2];
			ret[d2] = temp;
		}
		for(int i = 1;i < w+1;i++){
			System.out.println(ret[i]);
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}