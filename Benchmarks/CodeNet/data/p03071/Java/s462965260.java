import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static BufferedReader reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		String A_B = readLine();
		String[] AB = A_B.split(" ");
		int A = Integer.parseInt(AB[0]);
		int B = Integer.parseInt(AB[1]);
		if(A>B){System.out.println(A*2-1);}
		else if(A<B){System.out.println(B*2-1);}
		else{System.out.println(A*2);}
	}

	private static String readLine(){
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}