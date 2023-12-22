import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int number=1;
		while(true){
			String s=reader.readLine();
			if(s.equals("0")){
				System.exit(0);
			}
			System.out.println("case"+number+":"+s);
			number++;
		}
	}
}
		