import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);
		
		int shakkin=100000;
		
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			shakkin*=1.05;
			if(shakkin%1000!=0)
				shakkin=(shakkin/1000+1)*1000;
		}
		
		System.out.println(shakkin);
	}
}