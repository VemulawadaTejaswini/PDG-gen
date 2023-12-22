import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    double n, m, left;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    m = sc.nextInt();
	    if(n==0 && m==0) break;

	    left = n;
	    for(int i=0; i<m; i++)
		left = Math.min(left, sc.nextInt());

	    System.out.println(left==1 ? "0.0" : n/2.0);	 
	}
    }
}
	   