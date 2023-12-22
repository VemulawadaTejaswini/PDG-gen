
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);
		for(String line=br.readLine(); line!=null; line=br.readLine()) {
			if(line.length()==0) break;
			int n=Integer.parseInt(line);
			int count=0;
			for(int i=2; i<=n; i++) {
				boolean prime=true;
				for(int j=2; j<=(int)Math.sqrt(i); j++) {
					if(i%j==0) {
						prime=false;
						break;
					}
				}
				if(prime) count++;
			}
			System.out.println(count);
		}
	}

}