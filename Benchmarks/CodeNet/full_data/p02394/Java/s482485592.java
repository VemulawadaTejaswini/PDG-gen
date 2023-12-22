import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] div = str.split(" ");
		int W =  Integer.parseInt(div[0]);
		int H =  Integer.parseInt(div[1]);
		int x =  Integer.parseInt(div[2]);
		int y =  Integer.parseInt(div[3]);
		int r =  Integer.parseInt(div[4]);

		if( x-r<0 || y-r<0 || x+r>W || y+r>H ){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");		
		}
	}	
}