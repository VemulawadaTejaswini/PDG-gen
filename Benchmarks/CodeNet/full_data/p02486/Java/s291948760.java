import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {

	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    int x = kbd.nextInt();
	    int z=0;
	    if(!(n==0 && x==0)){
		for(int a=1; a<=n; a++){
		    for(int b=1; b<=n; b++){
			for(int c=1; c<=n; c++){
			    //System.out.println(a+" "+b+" "+c);
			    if(m(a,b,c,x)) z++;
			}
		    }
		}
	    }
	    System.out.println(z);
	}
    }
    static boolean m(int a, int b, int c, int x){
	boolean p = a+b+c==x;
	boolean q = a<b && b<c;
	return p&&q;
    }
}