import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int[] table = new int[10];
		table[0] = 1;
		for(int i=1; i< 10;i++){
			table[i] = table[i-1]<<1;
		}
		for(;sc.hasNextInt();){
			int n = sc.nextInt();
			String out = "";
			for(int i = 0; i< 10;i++){
				if((table[i] & n) == 0) continue;
				out += (table[i]) +" ";				
			}
			System.out.println(out.trim());
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}