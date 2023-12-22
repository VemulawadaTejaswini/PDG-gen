import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int x, y;
	while(sc.hasNext()){
	    x = sc.nextInt();
	    y = sc.nextInt();
	    
	    while(x!=0 && y!=0){
		int p, q;
		p = Math.min(x, y);
		q = Math.max(x, y);
		x = q-p;
		y = p;
	    }
	    
	    System.out.println(Math.max(x,y));
	}
    }
}