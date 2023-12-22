import java.io.*;
//import java.math.BigDecimal;
//import java.lang.reflect.Array;
//import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			do {
				String[] in = line.split(" ", 0);
				//???????????????????¨????
				int a = Integer.parseInt(in[0]);
				int b = Integer.parseInt(in[1]);
				while (a != b){
					if(a > b){
						a = a- b;
					}else{
						b = b - a;
					}
				}
				long out2 = Long.parseLong(in[0]) * Long.parseLong(in[1]) / a;
				System.out.println(a + " " + out2);
				//???????????§??????
				line = br.readLine();
			} while (line != null);

		} catch (Exception e) {
			// TODO: handle exception
			System.exit(0);
		}

	}

}