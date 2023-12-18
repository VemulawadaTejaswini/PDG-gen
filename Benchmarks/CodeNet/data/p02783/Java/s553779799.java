import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] strings = readLine();
		int H = Integer.parseInt(strings[0]);
		int A = Integer.parseInt(strings[1]);
		
		print((H+A-1)/A);
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC

	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}
