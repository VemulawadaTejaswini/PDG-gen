import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int i = 0;
		int min = 0;
		int max = 0;

		while(true){	
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x>y || x==y){
			min = y;
			max = x;
		}else{
			min = x;
			max = y;
		}
		if(x==0 && y==0) break;
		System.out.println(min + " " + max);
		}
	}
} 