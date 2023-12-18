import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] w = {"Sunny", "Cloudy", "Rainy"};
		String s = sc.next();
		String ans = "";
		for(int i=0; i<3; i++)
			if(s.equals(w[i]))
				ans = w[(i+1)%3];
		
		System.out.println(ans);
		
		sc.close();
	}
}
