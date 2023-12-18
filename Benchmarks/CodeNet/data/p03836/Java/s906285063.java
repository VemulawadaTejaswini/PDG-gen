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
	    int b=Integer.parseInt(s1[1]);
	    int c=Integer.parseInt(s1[2]);
	    int d=Integer.parseInt(s1[3]);

	    int sx=0;
	    int sy=0;
	    int tx=c-a;
	    int ty=d-b;

	    StringBuilder sb=new StringBuilder();
	    for(int i=0;i<ty;i++){
		sb.append("U");
	    }
	    for(int i=0;i<tx;i++){
		sb.append("R");
	    }
	    for(int i=0;i<ty;i++){
		sb.append("D");
	    }
	    for(int i=0;i<tx;i++){
		sb.append("L");
	    }

	    sb.append("L");
	    
	    for(int i=0;i<ty+1;i++){
		sb.append("U");
	    }
	    for(int i=0;i<tx+1;i++){
		sb.append("R");
	    }

	    sb.append("DR");
	    
	    for(int i=0;i<ty+1;i++){
		sb.append("D");
	    }
	    for(int i=0;i<tx+1;i++){
		sb.append("L");
	    }

	    sb.append("U");

	    System.out.println(sb);
	    
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
