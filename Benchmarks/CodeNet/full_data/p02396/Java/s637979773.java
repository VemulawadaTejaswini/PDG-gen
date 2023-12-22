import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int i = 1;
		while(true){
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();
			if (x == 0){
				break;
			}else{

				System.out.println("Case " + i +": " + x);
			}
			i++;
		}	

	}
}