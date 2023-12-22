import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] card = new int[4][14];
		for(int i = 0; i < n; i++){
			String str = sc.next();
			int x = sc.nextInt();
			if(str.equals("S")){
				card[0][x] = 1;
			}
			else if(str.equals("H")){
				card[1][x] = 1;
			}
			else if(str.equals("C")){
				card[2][x] = 1;
			}
			else {
				card[3][x] = 1;
			}
		}
		for(int i = 0; i < card.length; i++) {
			for(int j = 1; j < card[i].length; j++){
				if(card[i][j] == 0){
					if(i == 0){
						System.out.println("S" + j);
					}
					else if(i == 1){
						System.out.println("H" + j);
					}
					else if(i == 2){
						System.out.println("C" + j);
					}
					else{
						System.out.println("D" + j);
					}
					
				}
			}
		}
			
	}

}