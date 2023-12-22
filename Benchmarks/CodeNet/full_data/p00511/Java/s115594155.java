import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    int ans;
    String s;

    void run(){
	while(sc.hasNext()){
	    ans = sc.nextInt();
	    s = sc.next();
	    while(!s.equals("=")){
		calc();
		s = sc.next();
	    }
	    System.out.println(ans);
	}
    }

    void calc(){
	if(s.equals("+"))
	    ans = ans + sc.nextInt();
	else if(s.equals("-"))
	    ans = ans - sc.nextInt();
	else if(s.equals("*"))
	    ans = ans * sc.nextInt();
	else if(s.equals("/"))
	    ans = ans / sc.nextInt();
    }
}
	    