import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int b;
		
		int[] open = new int[3];
		
		for(int i = 0; i < 3; i++){
			b = scan.nextInt();
			open[i] = b;
		}
		
		if((open[0] == 1 && open[1] == 1 && open[2] == 0)
			|| open[2] == 1)System.out.println("Open");
		else System.out.println("Close");
	}
}