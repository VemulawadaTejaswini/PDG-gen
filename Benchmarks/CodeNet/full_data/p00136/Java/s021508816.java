import java.util.*;
public class Main0136{
    public static void main(String[] args){
	new Main0136().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int[] h;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    h = new int[6];
	    for(int i=0; i<n; i++){
		double x = sc.nextDouble();
		apart(h, x);
	    }
	    
	    for(int i=0; i<h.length; i++){
		System.out.print((i+1)+":");
		for(int k=0; k<h[i]; k++)
		    System.out.print("*");
		System.out.println();
	    }
	}
    }

    void apart(int[] h, double x){
	if(x<165.0) h[0]++;
	else if(x<170.0) h[1]++;
	else if(x<175.0) h[2]++;
	else if(x<180.0) h[3]++;
	else if(x<185.0) h[4]++;
	else h[5]++;
    }
}