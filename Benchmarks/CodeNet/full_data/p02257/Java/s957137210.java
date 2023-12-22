import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		Integer count = 0;
		while(s.hasNext()){
			Integer number = Integer.parseInt(s.next());
			boolean is_prime = true;
			Integer max = number;
			if(number > 10){
				max = (number - number % 3) / 3;
			}
			for(int i = 2; i < max; i++){
				if(number == 1 || number == 2){
					break;
				}
				if(number % i == 0){
					is_prime = false;
					break;
				}
			}
			if(is_prime){
				count++;
			}
		}
		s.close();
		System.out.println(count);
	}
}