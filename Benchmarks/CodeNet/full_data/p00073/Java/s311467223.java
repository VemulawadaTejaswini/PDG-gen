import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    double x;
    double h;

    void run(){
	while(sc.hasNext()){
	    x = sc.nextDouble();
	    h = sc.nextDouble();
	    if(x!=0) solve();
	}
    }

    void solve(){
	double r = Math.sqrt(h*h+(x/2)*(x/2));
	double s = x*x + 2*(x*r);
	System.out.println(s);
    }
}