import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    String str=reader.readLine();
	    String s[]=str.split(" ");

	    int a=Integer.parseInt(s[0]);
	    int b=Integer.parseInt(s[1]);
	    int c=Integer.parseInt(s[2]);
	    int d=Integer.parseInt(s[3]);

	    int e=a*b;
	    int f=c*d;

	    if(e<f){
		System.out.println(f);
	    }else{
		System.out.println(e);
	    }
	    
	    reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int gcd (int a, int b){
	return b>0?gcd(b,a%b):a;
    }
    static int lcm (int a, int b) {
	return a*b/gcd(a,b);
    }
}
