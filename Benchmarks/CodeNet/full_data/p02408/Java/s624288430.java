import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean[] numbers = new int[4][13];
		
		for(int i = 0; i < n; i++){
			String mark = scanner.nextString();
			int card = scanner.nextInt();
			if(mark.equals("S")){
				numbers[0][card-1] = true;
			}else if(mark.equals("H")){
				numbers[1][card-1] = true;
			}else if(mark.equals("C")){
				numbers[2][card-1] = true;
			}else if(mark.equals("D")){
				numbers[3][card-1] = true;
			}
		}

		for(int i = 0; i <= 3; i++){
			for(int j = 0; j <= 13; j++){
				if(numbers[i][j] == false){
					if(i.equals("S")){
						System.out.println("S " + j)
					}else if(mark.equals("H")){
						System.out.println("H " + j)
					}else if(mark.equals("C")){
						System.out.println("C " + j)
					}else if(mark.equals("D")){
						System.out.println("D " + j)
					}
				}
			}
		}
	}

}