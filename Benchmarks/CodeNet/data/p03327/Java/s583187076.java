import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private BufferedReader br;
	private int n;
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		new Main().start();
	}
	public void start()throws IOException{
		br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		if(n<=999){
			System.out.println("ABC");
		}
		else{
			System.out.println("ABD");
		}
	}

}
