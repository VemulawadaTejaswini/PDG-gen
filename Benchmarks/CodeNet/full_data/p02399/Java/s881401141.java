import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] ArrayX = new String[2];
		int[] Numbers = new int[2];
		int divite;
		int amari;
		float syosu;
		
				
		ArrayX = line.split(" ");
		Numbers[0] = Integer.parseInt(ArrayX[0]);
		Numbers[1] = Integer.parseInt(ArrayX[1]);
		
		divite = Numbers[0]/Numbers[1];
		amari =Numbers[0]%Numbers[1];
		syosu = (float)Numbers[0]/Numbers[1]-divite;
		
		System.out.println(divite + " " + amari + " " + syosu);
	}

}