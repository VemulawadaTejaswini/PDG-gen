import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws Exception {
try {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String input = buf.readLine();
	
	while(true){
		String[] strAry = input.split(" ");
	       int x = Integer.parseInt(strAry[0]);
	       int y = Integer.parseInt(strAry[1]);
		if(x == 0 && y == 0){
			break;
		}
		if(x > y){
		int chg = x;
		x = y;
		y = chg;
		}		
		System.out.println(x + " " + y);
		input =buf.readLine();
	}
} catch (Exception e) {
	// TODO: handle exception
}
		 }
    }