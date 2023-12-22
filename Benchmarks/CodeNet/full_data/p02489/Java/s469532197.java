import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x;
		int i=0;
		try{
			while((x=Integer.valueOf(br.readLine()))!=0){
				i++;
				System.out.println("Case " + i + ": " + x);
			}

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}