import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		
		
		
		InputStreamReader is = new InputStreamReader(System.in);       
        BufferedReader br = new BufferedReader(is);                   

        System.out.println("??°????????\?????????????????????.");

        String str = br.readLine();  
		int x= Integer.parseInt(str);

        System.out.println(x*x*x);
		
		
		
	}
}
		
    