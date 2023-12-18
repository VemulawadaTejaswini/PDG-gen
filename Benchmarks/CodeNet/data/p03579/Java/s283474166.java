import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        
        int n = Integer.parseInt(str.split(" ")[0]);
        
        int m = Integer.parseInt(str.split(" ")[1]);
		// 出力
		System.out.println(n*(n-3)/2+n-m);
	}
}