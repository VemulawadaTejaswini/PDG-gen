import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			String str[] = scan.nextLine().split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			if(h==0 && w==0) break;
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
} 