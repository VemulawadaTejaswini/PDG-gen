import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    String s;
    int i, ans, x, y;

    void run(){
	while(sc.hasNext()){
	    s = sc.next();
	    ans = 0;
	    x = change(s.substring(0, 1));
	    for(i=1; i<s.length(); i++){
		y = change(s.substring(i, i+1));
		//System.out.println(x+" "+y);
		if(x>=y){
		    ans += x;
		    x = y;
		}
		else if(x<y){
		    ans -= x;
		    x = y;
		}
	    }
	    ans += y;
	    System.out.println(ans);
	}
    }

    int change(String a){
	if(a.equals("I"))
	    return 1;
	else if(a.equals("V"))
	    return 5;
	else if(a.equals("X"))
	    return 10;
	else if(a.equals("L"))
	    return 50;
	else if(a.equals("C"))
	    return 100;	
	else if(a.equals("D"))
	    return 500;
	else if(a.equals("M"))
	    return 1000;
	return -100000;  // エラー扱い
    }
}