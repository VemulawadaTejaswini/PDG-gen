import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
//recode
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
        String[] Aa = line.split(" ");
        int A = Integer.parseInt(Aa[0]);
        int B = Integer.parseInt(Aa[1]);
        int C = Integer.parseInt(Aa[2]);
        long K = Long.parseLong(Aa[3]);
        System.out.println(A-B);
    }
		
		

}


