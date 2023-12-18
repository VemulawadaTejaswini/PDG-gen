import java.io.*;

public class Main{
	public static final int YEAR = 2019;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int L = Integer.parseInt(line[0]);
		int R = Integer.parseInt(line[1]);
		
		if( R - L != R%YEAR - L%YEAR ){
			System.out.println(0);
		}else if( L%YEAR <= Math.sqrt(YEAR) && Math.sqrt(YEAR) <= R%YEAR ){
			System.out.println(Math.ceil(Math.sqrt(YEAR)) * Math.ceil(Math.sqrt(YEAR))%YEAR);
		}else{
			System.out.println(L*(L+1)%YEAR);
		}
	}
}
