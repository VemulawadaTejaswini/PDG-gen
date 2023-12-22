import java.io.*;  
public class Main {
    public static void main(String[] args) throws IOException {
	                                         
    	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf = br.readLine();
    String[] x = buf.split(" ",0);

    	int a = Integer.parseInt(x[0]);
    	int b = Integer.parseInt(x[1]);

    	while (a!=0 || b!=0){
    	if ((0 <= a && a <= 10000)&&(0 <= b &&  b <=10000))
    		{
    		if(a>b){
    		int temp = a;
    		    a = b;
    		    b =temp;
    		}
    		System.out.println(a + " " + b); 
    		buf = br.readLine();
    		x = buf.split(" ",0);

    		a = Integer.parseInt(x[0]);
    		b = Integer.parseInt(x[1]);
    	}
    		
    	}
    
	}
}