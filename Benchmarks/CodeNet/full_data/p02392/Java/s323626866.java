import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Judge{
	int judgeit(int a,int b,int c){
		if(a < b && b < c){
			return 0;
		}
		else{
			return 1;
		}
	}
}

class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		String ans[] = {"Yes","No"};
		Judge cr = new Judge();
		System.out.println(ans[cr.judgeit(a,b,c)]);
	}
}