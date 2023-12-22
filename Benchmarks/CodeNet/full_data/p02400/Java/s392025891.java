import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		double r = Double.parseDouble(line);
		
		String area = String.format("%.6f",((double)r *(double)r * Math.PI));
		String cir = String.format("%.6f",(2 * (double)r * Math.PI));
		
		sb.append(area).append(" ").append(cir).append("\n");
		System.out.print(sb);
	}
}