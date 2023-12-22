import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(true){
			int data= Integer.parseInt(br.readLine());
			if(data==0)
				break;
			
			System.out.println("Case "+Integer.toString(i++)+": "+Integer.toString(data));
		}
	}
}