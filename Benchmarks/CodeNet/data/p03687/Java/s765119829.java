import java.util.*;
import java.io.*;

public class Main {
	
	public static int shrink(String s, char x){
		if(s.replaceAll(x+"","").equals("")) return 0;
		int L = s.length();
		String next = "";
		for(int i=1;i<L;i++){
			if(s.charAt(i-1)==x || s.charAt(i)==x) next = next+x;
			else next = next + "0";
		}
		return shrink(next,x)+1;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        final int INF = 1_000_000;
        int ans = INF;
        
        for(char x='a';x<='z';x++){
        	ans = Math.min(ans,shrink(s,x));
        }
        System.out.println(ans);
    }
}