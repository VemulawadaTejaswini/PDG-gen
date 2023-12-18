import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main	 {
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	long n = sc.nextLong();
        	long res =0;
        	for(int i=1;i<=n;i++) {
        		if(i%3!=0 && i%5!=0)
        			res=res+i;
        	}
        	System.out.println(res);
    }
}
