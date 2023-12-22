import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String dat;
		dat=br.readLine();
		
		do{
			int i=0;
			int g=0;
			do{
				g += Integer.parseInt(dat.substring(i,i+1));
				i++;
			} while(i<dat.length());
			System.out.println(g);
			dat=br.readLine();
		}while(dat.equals("0")==false);
		
	}

}