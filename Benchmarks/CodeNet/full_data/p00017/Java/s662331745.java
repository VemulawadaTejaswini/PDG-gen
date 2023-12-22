import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    String s;
    char[] ss;


    void run(){
	while(sc.hasNext()){
	    s = sc.nextLine();
	    solve();
	}
    }

    void solve(){
	ss = s.toCharArray();
	int level = 0;
	for(; level<26; level++){
	    if(change(ss)){
		show(ss);
		return;
	    }
	}
    }

    boolean change(char[] ss){
	for(int i=0; i<ss.length; i++){
	    if(ss[i]>='a' && ss[i]<='z'){
		if(ss[i]+1>'z'){
		    ss[i] = 'a';
		}
		else ss[i] += 1;
	    }
	}
	//show(ss);
	if(check(ss)) return true;
	else return false;
    }

    void show(char[] ss){
	for(int i=0; i<ss.length; i++)
	    System.out.print(ss[i]);
	System.out.println();
    }

    boolean check(char[] ss){
	String c = "";
	for(int i=0; i<ss.length; i++){
	    if(c.length()==0 && ss[i]=='t'){
		int k = i;
		while(k<ss.length && ss[k]!=' '){
		    c += ss[k];
		    k++;
		}
		if(c.equals("the") || c.equals("this") || c.equals("that"))
		    return true;
		else c = "";
	    }
	}
	return false;
    }
}