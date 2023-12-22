import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String num=br.readLine();
			if(num==null){
				break;
			}
			int a=Integer.parseInt(num.split(" ")[0]),b=Integer.parseInt(num.split(" ")[1]);
			System.out.println(a+b);
		}
	}
}