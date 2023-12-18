import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int min = Integer.MAX_VALUE;
 
		String[] x = new String[S.length()];
		for(int i=0; i<S.length(); i++){
			String str = String.valueOf(S.charAt(i));
			x[i] = str;
			if(i>1){
				int X = Integer.parseInt(x[i-2]+x[i-1]+x[i]);
				//System.out.println(X);
				int d = Math.abs(753-X);
				if(d<min){
					min = d;
				}
			}
		}
		System.out.println(min);
	}
}
import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int min = Integer.MAX_VALUE;

		String[] x = new String[S.length()];
		for(int i=0; i<S.length(); i++){
			String str = String.valueOf(S.charAt(i));
			x[i] = str;
			if(i>1){
				int X = Integer.parseInt(x[i-2]+x[i-1]+x[i]);
				//System.out.println(X);
				int d = Math.abs(753-X);
				if(d<min){
					min = d;
				}
			}
		}
		System.out.println(min);
	}
}
提出情報