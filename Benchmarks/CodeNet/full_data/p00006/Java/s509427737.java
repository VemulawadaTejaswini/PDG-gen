import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    String s = kbd.next();
	    solve(s);
	}
    }

    static void solve(String s){
	String[] re = new String[s.length()];
	int i;
	for(i=0; i<s.length(); i++){
	    re[i] = s.substring(i, i+1);
	}
	String ans = "";
	for(i=re.length-1; i>=0; i--){
	    ans += re[i];
	}
	System.out.println(ans);
    }
}