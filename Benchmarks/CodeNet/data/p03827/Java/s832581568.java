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
	    String s1[]=str.split(" ");

	    int a=Integer.parseInt(s1[0]);
	    String s=reader.readLine();
	    char c[]=s.toCharArray();

	    int count=0;
	    int max=0;

	    for(int i=0;i<a;i++){
		if(c[i]=='I'){
		    count++;
		    max=Math.max(max,count);
		}else{
		    count--;
		}
	    }

	    System.out.println(max);

	    
	    
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
