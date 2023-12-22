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
			if (0 <=x && x <=100){
				System.out.println(x*x*x);
			}else{
				System.out.println("Error");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}



	}

}