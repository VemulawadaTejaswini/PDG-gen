import java.util.Scanner;

public class ITP1_5_A{
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int height = Integer.parseInt(sc.next());
		int wide = Integer.parseInt(sc.next());
		
		for(int i = 1; i <= height; i = i + 1){
			for(int j = 1; j <= wide; j = j + 1){
				System.out.print("#");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}