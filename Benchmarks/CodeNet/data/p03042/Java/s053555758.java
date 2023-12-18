import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int former = Integer.parseInt(s.substring(0,2));
	int later = Integer.parseInt(s.substring(2,4));
	boolean a = false;
	boolean b = false;
	if(former > 0 && former <= 12) a = true;
	if(later > 0 && later <= 12) b = true;
	if(a && b){
		System.out.println("AMBIGUOUS");
	}else if(a && !b){
		System.out.println("MMYY");
	}else if(!a && b){
		System.out.println("YYMM");
	}else{
		System.out.println("NA");	
	}
}
}
