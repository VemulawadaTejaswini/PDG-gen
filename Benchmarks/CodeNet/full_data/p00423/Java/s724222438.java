import java.io.*;
public class Program0500 {
	public static void main(String[] args){
		int scores[] = new int[2];
		try{
			BufferedReader std = new BufferedReader(new InputStreamReader(System.in));
			int len = Integer.parseInt(std.readLine());
			for(int i=0; i<len; i++){
				String num[] = std.readLine().split(" ");
				if(num[0].compareTo(num[1]) > 0){       scores[0] += Integer.parseInt(num[0]) + Integer.parseInt(num[1]); }
				else if(num[0].compareTo(num[1]) < 0){  scores[1] += Integer.parseInt(num[0]) + Integer.parseInt(num[1]); }
			}
		}
		catch(IOException e){}
		catch(NumberFormatException e){}
		System.out.println(scores[0] + " " + scores[1]);
	}
}