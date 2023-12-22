import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strArray = str.split(" ");
		
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		int c = Integer.parseInt(strArray[2]);
		
		if(a < b && b < c){
		System.out.println("Yes");
	    }
		else{
			System.out.println("No");
		}
	}
}