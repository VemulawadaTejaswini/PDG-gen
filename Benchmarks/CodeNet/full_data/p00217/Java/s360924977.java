import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, Nmax, Dmax;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    Nmax = -1; Dmax = 0;
	    for(int i=0; i<n; i++){
		int n = sc.nextInt();
		int d = sc.nextInt()+sc.nextInt();
		if(Dmax<d){
		    Nmax = n;
		    Dmax = d;
		}
	    }

	    System.out.println(Nmax+" "+Dmax);
	}
    }
}