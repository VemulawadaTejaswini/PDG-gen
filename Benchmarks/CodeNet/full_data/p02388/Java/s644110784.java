import java.io.*;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		System.out.print("What is number?:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num_s = br.readLine();
		int num = Integer.parseInt(num_s);
                System.out.println(num*num*num);
        }
}