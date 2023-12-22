import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		
		String[] x = input.split(" ");
		
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int c = Integer.parseInt(x[2]);
		
		if(b > a && c > b){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}