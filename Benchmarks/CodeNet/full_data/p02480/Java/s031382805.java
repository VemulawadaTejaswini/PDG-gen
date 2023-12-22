
public class Main {
	public static void main(String[] a) {
		int x = Integer.parseInt(a[0]);
		int cubic = 1;
		
		for(int i = 0; i < 3; i++)
			cubic *= x;
		
		System.out.println(cubic);
		
	}

}