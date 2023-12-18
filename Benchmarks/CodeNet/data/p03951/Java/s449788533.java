import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String front="";
		String back="";
		try {
			r.readLine();
			front = r.readLine();
			back = r.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<=back.length();i++){
			String test = front + back.substring(back.length()-i, back.length());
			if(test.indexOf(back) != -1){
				System.out.println(test.length());
				return;
			}
		}
	}
}
