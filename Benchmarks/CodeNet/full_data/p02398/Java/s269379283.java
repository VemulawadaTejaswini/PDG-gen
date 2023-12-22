import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input_line = new Scanner(System.in);
		String input = input_line.nextLine();
		String[] Array = input.split(" ");
		int a = Integer.parseInt(Array[0]);
		int b = Integer.parseInt(Array[1]);
		int c = Integer.parseInt(Array[2]);
		int num;
		int count = 0;
		for(num = a; num <=b ; num++){
			if(c%num == 0){
				count = count + 1;
			}
		}
		System.out.println(count);	
	}
}