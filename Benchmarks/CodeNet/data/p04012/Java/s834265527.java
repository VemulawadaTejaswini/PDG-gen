import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		char [] w = sc.next().toCharArray();
		char [] a = new char [24];
		int  [] c = new int  [24];
		int n = 0;
		boolean s = true; 
		
		for(int i = 0; i < w.length; i++){	
		a[n] = w[i]; 
		for(int j = 0; j < w.length; j++){
		if(w[i] == w[j]){ c[n] += 1; }  	
		}
		n += 1;
		}
		
		for(int i = 0; i < c.length; i++){	
		if( c[i] % 2 == 0 ){} else { s = false; }}
		
		if(s){ System.out.print("Yes"); } else { System.out.print("No"); }
	}}