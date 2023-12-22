import java.io.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0 ;
		int min = 114514 ;
		String current;
		while((current=br.readLine())!=null){
			if(Integer.parseInt(current)>max)
				max=Integer.parseInt(current);
			if(Integer.parseInt(current)<min)
				min = Integer.parseInt(current);
		}
		System.out.println(max-min);
	}
}