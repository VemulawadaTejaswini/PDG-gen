import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    String s;
    StringBuffer str;
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
	str = new StringBuffer();
	while(n>0){
	    n--;
	    cut();
	    s = str.toString();
	    str.setLength(0);
	}
	System.out.println(s);
    }

    void cut(){
	int i=0;
	count = 0;
	t = "";
	while(i<s.length()){
	    if(!t.equals(s.substring(i, i+1))){
		if(count!=0){
		    str.append(count + t);
		}
		t = s.substring(i, i+1);
		count = 1;
	    }
	    else count++;
	    i++;
	}
	str.append(count + t);
    }
}