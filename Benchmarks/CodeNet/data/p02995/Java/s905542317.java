import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{	
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	long a = Integer.parseInt(sc.next());
	long b = Integer.parseInt(sc.next());
	long c = Integer.parseInt(sc.next());
	long d = Integer.parseInt(sc.next());
	long s = 0;
	
	for(long i = a; i < b+1; i++){
		if(i%c !=0 && i%d !=0)s++;
	}
	System.out.println(s);
}
}
