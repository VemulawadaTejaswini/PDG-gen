import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		Input input = new Input();
		Converter conv = new Converter(); 
		
		int a = conv.intconv(input.input());
		int b = conv.intconv(input.input());
		int c = conv.intconv(input.input());
		
		System.out.println((a+b)*c/2);

	
	}
}




class Input{
	private String buf;
	BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
	
	public String input() {
	try{
		this.buf = bufferdReader.readLine();
	}catch(Exception e) {
		
	}
	return buf;
	}
}


class Converter{
	
	private int convInt=0;
	
	
	/**
	 * String→Int変換機
	 * @param convInt
	 * @return this.convInt
	 */
	public int intconv(String convInt){
		this.convInt = Integer.parseInt(convInt);
		return this.convInt;
	}
	
}