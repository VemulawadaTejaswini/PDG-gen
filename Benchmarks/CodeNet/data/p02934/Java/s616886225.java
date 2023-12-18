import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main{
        
    public static void main(String[] args)throws IOException{
	br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out = new PrintWriter(System.out);
	int n = nextInt();
	int v[] = new int[n];
        for(int i = 0; i<n;i++){
	    v[i] = nextInt();
	}
	if(n==1){
	    out.println(v[0]);
	}else if(n==2){
	    out.println((double)(v[0]*v[1])/(double)(v[0]+v[1]));
	}else{
	    long x = v[0]*v[1];
	    long y = v[0]+v[1];
	    BigDecimal a = new BigDecimal(""+x);
	    BigDecimal b = new BigDecimal(""+y);
	    BigDecimal xt;
	    for(int i = 2;i<n;i++){
		xt = new BigDecimal(""+v[i]);
	        b = b.multiply(xt).add(a);
		a = a.multiply(xt); 
	    }
	    double t1 = a.doubleValue();
	    double t2 = b.doubleValue();
	    out.println(t1/t2);
	}
	out.close();
    }
    
    static BufferedReader br;
    static StringTokenizer st = new StringTokenizer("");
    static String next()throws IOException{
	while(!st.hasMoreTokens()){
	    st = new StringTokenizer(br.readLine());
	}
	return st.nextToken();
    }
    static int nextInt()throws IOException{
	return Integer.parseInt(next());
    }
    static long nextLong()throws IOException{
	return Long.parseLong(next());
    }
}