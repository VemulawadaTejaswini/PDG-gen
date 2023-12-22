import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String args[]){
		while(s.hasNext())
			System.out.println(String.valueOf(s.nextInt()+s.nextInt()).length());
	}
}