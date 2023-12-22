import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	solve();
    }

    static void solve(){
	int ans = 0, i;
	String s, a, b="";
	while(kbd.hasNext()){
	    s = kbd.nextLine();
	    for(i=0; i<s.length(); i++){
		a = s.substring(i, i+1);
		if(a.matches("[0-9]")){
		    b += a;
		}
		else{
		    if(!b.equals("")){
			ans += Integer.parseInt(b);
			b = "";
		    }
		}
	    }
	}
	System.out.println(ans);
    }
}