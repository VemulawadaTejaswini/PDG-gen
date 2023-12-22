import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner text = new Scanner(System.in);
		
		int a = text.nextInt();
		int b = text.nextInt();
		int c = text.nextInt();
		
		int s;
		int count = 0;
		
		for(s = a; s <= b; s++){
			
				if(c % s == 0){
					count++;
				}
		}
		
		System.out.println(count);

	}

}