import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String[] weather = {"Sunny","Cloudy","Rainy"};
		for(int i = 0; i < weather.length; i++) {
			if(s.equals(weather[i])) 
				System.out.println(i < weather.length - 1 ? weather[i + 1] : weather[0]);
		}
	}
}