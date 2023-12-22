import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ2012();
	}
	
	void AOJ2012(){
		while(sc.hasNext()){
			int e=sc.nextInt(), ans=Integer.MAX_VALUE;
			if(e==0)	break;
			for(int i=0; i*i*i<=e; i++){
				for(int j=0; j*j+i*i*i<=e; j++){
					int k=e-(i*i*i+j*j);
					if(i*i*i+j*j+k==e)	ans=min(ans,i+j+k);
				}
			}
			out.println(ans);
		}
	}
}