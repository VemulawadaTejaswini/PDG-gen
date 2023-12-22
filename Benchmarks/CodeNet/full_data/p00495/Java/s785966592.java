import java.util.*;
import java.math.*;
import java.io.*;
public class Main {
	static HashMap<String,String> map = new HashMap<String,String>();
	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] c = new int[a];
		int[] d = new int[b];
		for(int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}
		for(int i = 0; i < b; i++) {
			d[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < b; i++) {
			int count = i;
			int id    = 0;
			int j = i;
			for(j = i ; j < b; j++) {
				if(id >= a) break;
				if(d[j] != c[id]) {
					id++;
					j--;
					count++;
				}
				id++;
			}
			count += b - j ;
			min = Math.min(min, count);
		}
		System.out.println(a - min);
		
		
	}

}