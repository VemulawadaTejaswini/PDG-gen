import java.io.*;
class Main{
	public static void main(String args[]){
		BufferedReader readNum = new BufferedReader(new InputStreamReader(System.in));

		try{
			String stringNum = readNum.readLine();
			int Num = Integer.parseInt(stringNum);
			System.out.println((int)Math.pow(Num,3));
		}catch(IOException e){
			System.out.println("error");
		}

	}
}