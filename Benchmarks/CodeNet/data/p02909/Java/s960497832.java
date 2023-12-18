import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b="Sunny";
		String c="Cloudy";
		String d="Rainy";
		if(a.equals(b)){
			System.out.print("Cloudy");
		}
		else if(a.equals(c)){
			System.out.print("Rainy");
		}
		else if(a.equals(d)){
			System.out.print("Sunny");
		}
		
	}
}
