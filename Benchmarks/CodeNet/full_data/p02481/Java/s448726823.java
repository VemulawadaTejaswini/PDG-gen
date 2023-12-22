import java.util.Scanner;
 
class Main {
	
	public static void main (String[] args) {
		try (Scanner s = new Scanner(System.in);) {
			int i = s.nextInt();
			int j = s.nextInt();
			System.out.println(i*j+" "+(i*2 + j*2));
		} catch (Exception e) {
			System.out.println("エラー");
		}
	}
}