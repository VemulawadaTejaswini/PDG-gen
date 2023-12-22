import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] p = new boolean[100000];
	putN(p);
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    int c = 0;
	    int i;
	    for(i=0; i<=n; i++){
		if(p[i]) c++;
	    }

	    System.out.println(c);
	}
    }

    public static void putN(boolean[] p){
	p[0] = p[1] = false;
	int i, j;
	for(i=2; i<p.length; i++){
	    p[i] = true;
	    for(j=i+i; j<p.length; j+=i){
		p[j] = false;
	    }
	}
    }
}