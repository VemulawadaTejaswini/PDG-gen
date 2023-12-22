import java.io.*;
import java.util.ArrayList;
public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while ((line = br.readLine()) != null) {
			String[] numbers = line.split(" ");
			int a = Integer.parseInt(numbers[0]);
			int b = Integer.parseInt(numbers[1]);
			int a2 = a;
			int b2 = b;
			
			
			int limit = Math.min(a, b);
			ArrayList<Integer> elements = new ArrayList<Integer>();
			
			for (int i = limit; i > 1; i--){
				if (a % i == 0 && b % i == 0){
					a /= i;
					b /= i;
					elements.add(i);  
					continue;
				}
			}
			
			int gcd = 1;
			for(int i : elements){
				gcd *= i;
			}
			
			int lcm = (a2 / gcd) * b2;
			System.out.println(gcd + " " + lcm);
        }
	}
}