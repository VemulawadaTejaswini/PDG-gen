import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String N = sc.next();	
		
		int price = 700;
		
		if(N.equals("ooo"))
			price=1000;
		else if(N.equals("oox")||N.equals("oxo")||N.equals("xoo"))
			price=900;
		else if(N.equals("xxx"))
			price=700;
		else
			price=800;
		
		System.out.println(price);
		

	}

}
