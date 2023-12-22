import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{

	public static void main(String[] args) {
		String s;
		int a=0;
		int b=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			s=br.readLine();
			a=Integer.parseInt(s.substring(0,s.lastIndexOf(" ")));
			b=Integer.parseInt(s.substring(s.lastIndexOf(" ")+1,s.length()));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(a<b){
			System.out.println("a < b");
		}
		else if(a>b){
			System.out.println("a > b");
		}
		else{
			System.out.println("a == b");
		}
	}

}