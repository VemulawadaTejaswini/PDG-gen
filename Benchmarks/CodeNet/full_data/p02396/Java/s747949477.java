import java.util.Scanner;

class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		for (int i= 1;;++i){
			int a = in.nextInt();
			if (a == 0) break;
			System.out.println("case "+i+": "+a);
		}
	}	
}