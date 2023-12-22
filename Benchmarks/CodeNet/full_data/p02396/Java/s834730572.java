import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		
		
	    int data;
	    for(;(data=isr.read())!=0;){
	    	System.out.println(data);
	    }}}