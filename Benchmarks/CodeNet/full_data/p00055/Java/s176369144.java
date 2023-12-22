import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    void run(){
	while(sc.hasNext()){
	    double a = sc.nextDouble();
	    solve(a);
	}
    }

    void solve(double a){
	double s = a;
	double prev = a;
	for(int i=2; i<11; i++){
	    if(i%2==0){
		s += prev*2;
		prev = prev*2;
	    }
	    else {
		s += prev/3;
		prev = prev/3;
	    }
	}
	System.out.println(s);
    }
}