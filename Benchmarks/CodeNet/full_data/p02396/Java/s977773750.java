import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		int i=0;
		while(true){
			int data= Integer.parseInt(reader.readLine());
			if(data==0)
				break;
			
			builder.append("Case ").append(Integer.toString(i++)).append(": ").append(Integer.toString(data)).append("\n");
		}
		builder.substring(0, builder.lastIndexOf("\n")-1);
		System.out.print(builder);
	}
}