import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args){
		String[] arg = readLine().split(" ");
		if(arg.length<2){return;}
		try{
			int T = Integer.parseInt(arg[0]);
			int X = Integer.parseInt(arg[1]);
			double t = (double)T/X;
			System.out.print(String.format("%.7f", t));
		}catch(Exception e){
			e.printStackTrace();
		}
		return;
	}

	private static String readLine(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}
