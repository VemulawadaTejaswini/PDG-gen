import java.util.*;
import java.io.*;

public class Main{


    static int f(int x){
    return x*x;
}

    
    
    public  static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String std = br.readLine();
	while(std!=null){
	int d=Integer.parseInt(std);
	int integral=0;
	for(int i=d;i<600;i+=d)
	    integral=integral+f(i)*d;
	System.out.println(integral);
	std = br.readLine();
	}
    }
}
	