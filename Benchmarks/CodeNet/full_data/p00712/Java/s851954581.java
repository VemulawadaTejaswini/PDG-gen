import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int p = in.nextInt();
			int q = in.nextInt();
			int a = in.nextInt();
			int n = in.nextInt();
			if((p|q|a|n)==0) break;
			System.out.println(search(1,(double)p/(double)q,a,n));
		}
	}
	
	public static int search(int d1, double d2, int d3, int d4){
		int count=0;
		for(int x=d1; x<=d3 ; x++){
			if(d4>0 && Math.abs(d2-1/(double)x)<0.00000001){
				count++;
			}
			else if(d2 < 1/(double)x);
			else if(d4>0 && d3 >= x*x) count = count + search(x,d2-1/(double)x,d3/x,d4-1);
			else;
		}
		return count;
	}
}