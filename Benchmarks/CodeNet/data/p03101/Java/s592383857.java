import java.util.Scanner;

public class Main　{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int inH = s.nextInt();
		int inW = s.nextInt();
		int inh = s.nextInt();
		int inw = s.nextInt();
		
		int result = (inH-inh) * (inW -inw);
		
		System.out.println(result);
		s.close();
		
	}

}