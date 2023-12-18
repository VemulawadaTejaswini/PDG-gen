import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String wether [] = {"Sunny","Cloudy", "Rainy","Sunny"};
				
		String w = sc.next();
		
		int i=0;
		
		while(!(w.equals(wether[i]))){
			i++;
		}
		i++;
		
		System.out.println(wether[i]);

	}
}