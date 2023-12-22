import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		for(int i=0; i<m; i++){
			int max = 0;
			int base = in.nextInt();
			int year = in.nextInt();
			int types = in.nextInt();
			for(int j=0; j<types; j++){
				int type = in.nextInt();
				double rate = in.nextDouble();
				int cost = in.nextInt();
				int result = 0;
				if(type == 0) result = tanri(base,year,rate,cost);
				else result = fukuri(base,year,rate,cost);
				if(max < result) max = result;
			}
			System.out.println(max);
		}
	}
	
	public static int tanri(int base, int year, double rate, int cost){
		int stock = base;
		int bnf = 0;
		for(int i=0; i<year; i++){
			bnf = bnf+(int)((double)stock*rate);
			stock = stock-cost;
		}
		return stock+bnf;
	}
	
	public static int fukuri(int base, int year, double rate, int cost){
		int stock = base;
		for(int i=0; i<year; i++){
			stock = (int)((double)stock*(1+rate))-cost;
		}
		return stock;
	}
}