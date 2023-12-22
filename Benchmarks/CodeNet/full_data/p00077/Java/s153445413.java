import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);

    void run(){
	while(kbd.hasNext()){
	    String s = kbd.next();
	    solve(s);
	}
    }

    void solve(String s){
	String ans = "";
	for(int i=0; i<s.length(); i++){
	    String x = s.substring(i, i+1);
	    if(x.equals("@")){
		i++;
		int y = Integer.parseInt(s.substring(i, i+1));
		i++;
		String z = s.substring(i, i+1);
		while(y>0){
		    ans += z;
		    y--;
		}
	    }
	    else ans += x;
	}

	System.out.println(ans);
    }
}