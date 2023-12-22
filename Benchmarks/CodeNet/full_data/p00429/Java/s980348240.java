import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    String s;
    String str;
    String t;
    int n, count;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n!=0){
		s = sc.next();
		solve();
	    }
	}
    }

    void solve(){
	str = "";
	while(n>0){
	    n--;
	    cut();
	    s = str;
	    str = "";
	}
	System.out.println(s);
    }

    void cut(){
	int i=0;
	count = 0;
	t = "";
	while(i<s.length()){
	    if(!t.equals(s.substring(i, i+1))){
		if(count!=0)
		    str += count + t;
		t = s.substring(i, i+1);
		count = 1;
	    }
	    else count++;
	    i++;
	}
	str += count + t;
    }
}