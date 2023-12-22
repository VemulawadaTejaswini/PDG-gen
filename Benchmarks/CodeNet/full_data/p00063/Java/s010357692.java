import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int cnt = 0;
    boolean tf;

    void run(){
	while(sc.hasNext()){
	    String a = sc.next();
	    if(a.length()==1){
		cnt++;
		continue;
	    }
	    tf = true;
	    solve(a);
	    if(tf){
		cnt++;
		//System.out.println(a);
	    }
	}
	System.out.println(cnt);
    }

    void solve(String a){
	String[] s = new String[a.length()];
	int i;
	for(i=0; i<a.length(); i++)
	    s[i] = a.substring(i, i+1);
	i=0;
	while(i<s.length/2){
	    if(!s[i].equals(s[a.length()-i-1])){
		tf = false;
	    }
	    i++;
	}
    }
}