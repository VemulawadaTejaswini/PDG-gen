import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		while(true){
			String str = br.readLine();
			if(str.equals(""))
				break;
			int n = Integer.parseInt(str);
			int s = 0;
			for(int i = 0; i < 600/n; i++){
				s += (i*n)*(i*n)*n;
			}
			System.out.println(s);
		}

		
	}

}