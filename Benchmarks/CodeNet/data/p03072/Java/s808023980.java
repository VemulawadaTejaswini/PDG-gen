import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static BufferedReader reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(readLine());
		int max_h = 0;
		int count = 0;
		String[] Hs = readLine().split(" ");
		for(int i=0;i<Hs.length;i++){
			if(max_h<=Integer.parseInt(Hs[i])) {
				count++;
				max_h = Integer.parseInt(Hs[i]);
			}
		}
		
		System.out.println(count);
	}

	private static String readLine(){
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}