import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static final int LENGTH = 10;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i, j;
		ArrayList<String> list = new ArrayList<String>(0);
		for(i=0; i<n; i++)
			list.add(br.readLine());
		
		long result = 0;
		int tmpResult;
		int[] base;
		while( 1 < list.size() ){
			base = Main.toArray(list.get(0));
			list.remove(0);
			tmpResult = 0;
			for(i=0; i<list.size(); i++){ 
				if( check(base, Main.toArray(list.get(i))) ){
					list.remove(i--);
					tmpResult++;
				}
			}
			result += tmpResult * (tmpResult+1) /2;
		}
		
		System.out.println(result);
	}
	
	public static boolean check(int[] a, int[] b){
		int i = 0;
		for(; i<26 && a[i] == b[i]; i++){}
		
		return i == 26;
	}
	
	public static int[] toArray(String a){
		int[] list = new int[26];
		
		for(int i=0; i<LENGTH; i++)
			list[(int)(a.charAt(i)) - 0x61]++;
		
		return list;
	}
}
