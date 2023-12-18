import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {
		
		ex1();
	}
	
	public static void ex1() {
		int X=0;
		int Y=0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        try{
            //String  = br.readLine();
            X = Integer.parseInt(br.readLine());
            Y = Integer.parseInt(br.readLine());
        }catch(Exception e){
        }
        
        System.out.println(X+Y/2);
	}
}