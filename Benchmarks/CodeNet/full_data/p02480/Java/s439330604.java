import java.io.*;

public class Main {
	public static void main(String[] args) {
		try{
		    while(true) {	
		    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String seisuu = reader.readLine();
			int s = Integer.parseInt(seisuu);
			System.out.println(s*s*s);
		    }
                }catch(java.io.IOException e){
			System.out.println(e);
		}
	}
}