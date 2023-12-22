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
			boolean[] array=new boolean[n];
			array[0]=false;	// 1は素数でない
			for(int i=1; i<array.length; i++)
				array[i]=true;
			for(int i=1; i<array.length; i++) { 
				if(array[i]) {
					count++;
					for(int j=1; j*(i+1)<=n; j++) {
						array[j*(i+1)-1]=false;
						//System.out.println(((i+1)*j-1)+": false");
					}
				}
			}
			System.out.println(count);
		}
	}

}