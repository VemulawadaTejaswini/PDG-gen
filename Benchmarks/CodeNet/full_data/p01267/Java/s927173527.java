import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, a, b, c, x;
    int f;
    int[] real;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    x = sc.nextInt();
	    if(n==0 && a==0 && b==0 && c==0 && x==0) break;

	    real = new int[n];
	    for(int i=0; i<n; i++)
		real[i] = sc.nextInt();

	    f = 0;
	    int i=0;
	    while(true){
		if(f>10000) break;
		if(x==real[i]) i++;
		if(i==real.length) break;
		x = (a*x+b)%c;
		f++;
	    }

	    System.out.println(f>10000 ? "-1" : f);
	}
    }
}