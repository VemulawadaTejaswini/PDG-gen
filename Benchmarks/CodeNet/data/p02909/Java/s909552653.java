import java.util.*;
public class Main {
	public static void main(String[] args){
		String today = Sunny;
		String S;
		if(today.equals("Sunny")){
			S = "Cloudy";
			System.out.println(S);
		}else if(today.equals("Cloudy")){
			S = "Rainy";
			System.out.println(S);
		}else if(today.equals("Rainy")){
			S = "Sunny";
			System.out.println(S);
		}
	}
}