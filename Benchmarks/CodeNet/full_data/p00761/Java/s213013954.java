import java.util.*;

public class Main{
	public static String minString(String str){
		char[] x = str.toCharArray();
		for(int i = 0; i < x.length; i++){
			int min = i;
			for(int j = i; j < x.length; j++){
				if( x[min] > x[j] ){
					min = j;
				}
			}
			char temp = x[min];
			x[min] = x[i];
			x[i] = temp;
		}
		return new String(x);
	}
	public static String maxString(String str){
		char[] x = str.toCharArray();
		for(int i = 0; i < x.length; i++){
			int max = i;
			for(int j = i; j < x.length; j++){
				if( x[max] < x[j] ){
					max = j;
				}
			}
			char temp = x[max];
			x[max] = x[i];
			x[i] = temp;
		}
		return new String(x);
	}
	public static void solve(int n, int l){
		int[] keep = new int[20];
		keep[0] = n;
		for(int i = 1; i < 20; i++){
			String str = Integer.toString(keep[i-1]);
			StringBuilder temp = new StringBuilder();
			if( str.length() < l ){
				int len = l - str.length();
				while( len-- > 0 ){
					temp.append("0");
				}
			}
			temp.append(str);
			String max = maxString(temp.toString());
			String min = minString(temp.toString());
		//	System.out.println(max + " " + min);
			keep[i] = Integer.parseInt(max) - Integer.parseInt(min);
			for(int j = 0; j < i; j++){
				if( keep[i] == keep[j] ){
					System.out.println(j + " " + keep[i] + " " + (i-j));
					return;
				}
			}		
		}
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n,l;
		while( (n = stdIn.nextInt()) != 0 | (l = stdIn.nextInt()) != 0 ){
			solve(n, l);
		}
	}
}