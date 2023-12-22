import java.io.*;
import java.util.*;
import java.lang.reflect.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   

    private static StringTokenizer st;

    public static void main ( String [] args ) throws IOException
    {
	    new Main().cal();
	
    }



    private void cal() throws IOException 
    {
     while(true){
     st= new StringTokenizer(br.readLine());
     int n = Integer.parseInt(st.nextToken());
     int a = Integer.parseInt(st.nextToken()); 
     int b = Integer.parseInt(st.nextToken());  
     if( n == 0 && a == 0 && b == 0) break;

	int out = 0;
	int temp;

	if( a > b ){ temp = a; a = b; b = temp;}

	if( a == b || b % a == 0){
		out = n/a;
		System.out.println(n-out);
		continue;
	}

	if( a > n ){
		System.out.println("0");
		continue;
	}

	out += n/a;
	int subs = n%a;
	int til;
	for( til = 1; til < a ; til++ ){
		if( (til*b)%a == 0 )	break;
	}
	for( int i=1; i < til ; i++ ){
		out += ((n-b*i)/a + 1);
	}

	System.out.println(n-out);

     }
    }

}