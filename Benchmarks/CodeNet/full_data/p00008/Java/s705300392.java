import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(sc.hasNext()){
			int num = sc.nextInt();
			
			for(int i = 0; i < 10; i++){
				for(int j = 0; j < 10; j++){
					for(int k = 0; k < 10; k++){
						for(int l = 0; l < 10; l++){
							if((i + j + k + l) == num)
								count++;
						}//l
					}//k
				}//j
			}//i
		}//while
	}
}