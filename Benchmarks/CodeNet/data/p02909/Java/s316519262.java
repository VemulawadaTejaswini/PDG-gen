import java.util.*;

public class Main{
	public static void main(String[] args){

		// 値取得
		Scanner sc = new Scanner(System.in);
		String wether = sc.next();

		// 天気条件
		if(wether.equals("Sunny")){

			System.out.println("Cloudy");
		}else if(wether.equals("Cloudy")){

			System.out.println("Rainy");
		}else{

			System.out.println("Sunny");
		}
	}
}