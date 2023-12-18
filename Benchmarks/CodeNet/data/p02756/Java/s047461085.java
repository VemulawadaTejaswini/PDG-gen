import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		StringBuffer sb = new StringBuffer(br.readLine());
		int q = Integer.parseInt(br.readLine());
		
		String line = null;
		for(int n=0;n<q;n++) {
			line = br.readLine();
			String[] arr = line.split(" ");
			if(arr[0].equals("1")) {
				sb.reverse();
			}
			if(arr[0].equals("2")) {
				if(arr[1].equals("1")) {
					sb.insert(0, arr[2]);
				}
				if(arr[1].equals("2")) {
					sb.append(arr[2]);
				}
			}
		
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
	
	

}
