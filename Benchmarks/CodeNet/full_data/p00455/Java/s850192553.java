import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    int h, m, s;
    int oh, om, os;

    void run(){
	while(sc.hasNext()){
	    h = sc.nextInt(); 
	    m = sc.nextInt();
	    s = sc.nextInt(); 
	    oh = sc.nextInt();
	    om = sc.nextInt();
	    os = sc.nextInt();

	    solve();
	}
    }

    int ah, am, as;

    void solve(){
	while(s>os){
	    os += 60;
	    om--;
	}
	while(m>om){
	    om += 60;
	    oh--;
	}
	ah = oh-h;
	am = om-m;
	as = os-s;

	System.out.println(ah+" "+am+" "+as);
    }
}
	    