import java.io.*;
class Main{
	public static void main(String[] args){
		
		try{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String c = in.readLine();
			
					int num = Integer.parseInt(c);
		
		System.out.println(num*num*num);
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}