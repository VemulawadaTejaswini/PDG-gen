import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		//????????¨?¨???????????????????
		Scanner sc = new Scanner(System.in);

		//
		while(true){
			int intH = sc.nextInt();
			int intW = sc.nextInt();

			for(int i = 0; i < intH; i++){
				for(int j = 0; j < intW; j++){
					if(j == intW){
						System.out.println("#");
					}else{
						System.out.print("#");
					}
				}
				System.out.println("");

			}
			System.out.println("");

			if((intH== 0) && (intW == 0)){
				break;
			}
		}
	}
}