import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
        if(s=="Sunny"){System.out.println("Cloudy");}
        if(s=="Cloudy"){System.out.println("Rainy");}
		if(s=="Rainy"){System.out.println("Sunny");}
	}
}
