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
	    String str1=reader.readLine();
	    String s1[]=str1.split(" ");

	    int a=Integer.parseInt(s1[0]);
	    int b=Integer.parseInt(s1[1]);
	    int c=Integer.parseInt(s1[2]);

	    if(b-a==c-b){
		System.out.println("YES");
	    }else{
		System.out.println("NO");
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
