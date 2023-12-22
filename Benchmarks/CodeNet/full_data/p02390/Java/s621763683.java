import java.io.*;

public class Watch{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String lineS =reader.readLine();
			int S= Integer.parseInt(lineS);
			
			if(0<=S && S<86400){
			    int h=S/3600;
			    int m=(S%3600)/60;
			    int s=S%60;
			    System.out.println(h+":"+m+":"+s);
			 }else{
			 	System.out.println("error");
			 }
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}
			
		