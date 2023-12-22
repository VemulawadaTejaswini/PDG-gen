import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int H=0, W=0;
		String str = null;
		String[] input = new String[2];
		int i, j;

		while(true){
			str = scan.nextLine();
			input = str.split(" ");
			H = Integer.parseInt(input[0]);
			W = Integer.parseInt(input[1]);
			if(H==0 && W==0){
				break;
			}
			for(i=0; i<H; i++){
				for(j=0; j<W; j++){
					if(((i+j)%2) == 0){
						System.out.print("#");
					}
					else{
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
