
import java.util.*;

public class Main {
	 
	static String str;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		float x1=cin.nextFloat(),y1=cin.nextFloat(),x2=cin.nextFloat(),y2=cin.nextFloat();
		System.out.println(Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));
	}
	
	
	
}
