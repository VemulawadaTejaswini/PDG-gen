import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int i = 1;

		while(true){
	            i++;
		    int x = scan.nextInt();
		    if(x==0) break;
		    System.out.println("case " + i + ": " + x );
		}
	}
} 