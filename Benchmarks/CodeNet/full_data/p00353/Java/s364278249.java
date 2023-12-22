import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    String str=reader.readLine();
	    String s[]=str.split(" ");
	    int a=Integer.parseInt(s[0]);
	    int b=Integer.parseInt(s[1]);
	    int c=Integer.parseInt(s[2]);

	    if(a>=c){
		System.out.println("0");
	    }else{
		int d=c-a;
		if(d<=b){
		    System.out.println(d);
		}else{
		    System.out.println("NA");
		}
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

