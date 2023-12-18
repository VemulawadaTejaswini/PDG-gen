import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s = readLine();
		char[] sc = s[0].toCharArray();
		if(sc[0]==sc[1]) {
			print((sc[2]==sc[3]&&sc[0]!=sc[2])?"Yes":"No");
		}else if(sc[0]==sc[2]) {
			print(sc[1]==sc[3]?"Yes":"No");
		}else if(sc[0]==sc[3]) {
			print(sc[1]==sc[2]?"Yes":"No");
		}else {
			print("No");
		}
		
		
	}

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
