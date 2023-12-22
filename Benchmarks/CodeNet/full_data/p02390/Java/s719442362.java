import java.io.*;

class Main{
	public static void main(String[] args){
		int hour=0;
		int min=0;
		int sec=0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			int lineNum = Integer.parseInt(line);
			hour = lineNum / 3600;
			min = (lineNum % 3600) / 60;
			sec = lineNum % 60;
			String watch = hour +":"+ min +":"+sec;
			System.out.println(watch);
		}
		catch(IOException e){
		}
	}
}