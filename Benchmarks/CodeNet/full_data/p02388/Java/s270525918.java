import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test1{

	public static void main(String[] args) {
	
		InputStreamReader str = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(str);
		try {
			String buf = br.readLine();
			int x = Integer.parseInt(buf);
			System.out.println(x*x*x);
		} catch (IOException e) {
		
			e.printStackTrace();
		}



	}

}