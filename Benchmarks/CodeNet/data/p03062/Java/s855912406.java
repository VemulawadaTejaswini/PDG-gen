import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int  n = Integer.parseInt(sc.next());
	long Pmin = 0; long Nmin = 0;
	long Psum = 0; long Nsum = 0;
	List<Long> positive = new ArrayList<Long>();
	List<Long> negative = new ArrayList<Long>();
	for(int i = 0; i < n; i++){
		long a = Long.parseLong(sc.next());
		if(a >= 0){
			if(positive.isEmpty())Pmin = a;
			positive.add(a);
			Pmin = Math.min(Pmin,a);
			Psum += a;
		}else{
			long b = Math.abs(a);
			if(negative.isEmpty())Nmin = b;
			negative.add(b);
			Nmin = Math.min(Nmin,b);
			Nsum += b;
		}
	}
	if(negative.size()%2 == 0){
		System.out.println(Psum + Nsum);
	}else{
		System.out.println(Psum + Nsum - Math.min(Pmin,Nmin)*2);
	}
}
}
