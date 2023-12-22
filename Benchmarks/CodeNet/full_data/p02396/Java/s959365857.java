import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		BufferedInputStream bis=new BufferedInputStream(System.in);
		
		
		
	    int data;
	    for(;;){data=bis.read();
	    
	    
	    char moji=(char)data;
	       if(moji!='0'){
	    	System.out.print(moji);
	    }else{break;}}
	
		
	}
}