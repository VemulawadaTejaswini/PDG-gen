import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Clock{
	int h,m,s;
	void doit(int t){
		int tmp = t;
		s = tmp % 60;
		tmp /= 60;
		m = tmp % 60;
		tmp /= 60;
		h = tmp;
		System.out.println(h + ":" + m + ":" + s);
	}
}

class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.next());
		Clock c = new Clock();
		c.doit(t);
	}
}