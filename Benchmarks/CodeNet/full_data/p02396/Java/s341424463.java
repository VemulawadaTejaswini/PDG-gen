import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder b = new StringBuilder();

		String str;
		str = "";
		
		int i;
		i = 0;

		while(true){
			i++;
			str = br.readLine();
			if(Integer.parseInt(str) == 0){break;}
			
			//str = str+ "Case " + Integer.toString(i) + ": " + str + "\n";
			
			b.append("Case ").append(Integer.toString(i)).append(": ").append(str).append("\n");
			
			
		}

		System.out.println(b);

	}
}