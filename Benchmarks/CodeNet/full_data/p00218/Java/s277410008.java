import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }

    Scanner kbd = new Scanner(System.in);

    void run(){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0) solve(n);
	}
    }

    void solve(int n){
	while(n>0){
	    int m = kbd.nextInt();
	    int e = kbd.nextInt();
	    int j = kbd.nextInt();
	    int rank = 0;
	    double ave3 = ave(m, e, j);
	    if(m==100 || e==100 || j==100)
		rank = 2;
	    else if(ave(m, e)>=90)
		rank = 2;
	    else if(ave3>=80)
		rank = 2;
	    else if(ave3>=70)
		rank = 1;
	    else if(ave3>=50 && (m>=80 || e>=80))
		rank = 1;

	    if(rank==2)
		System.out.println("A");
	    else if(rank==1)
		System.out.println("B");
	    else
		System.out.println("C");
	    n--;
	}
    }

    double ave(int m, int e){
	double a = (double)m;
	double b = (double)e;
	return (a+b)/2;
    }

    double ave(int m, int e, int j){
	double a = (double)m;
	double b = (double)e;
	double c = (double)j;
	return (a+b+j)/3;
    }
}