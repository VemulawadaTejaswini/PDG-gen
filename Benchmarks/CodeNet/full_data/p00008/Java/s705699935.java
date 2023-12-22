import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:" );
		int n = reader.nextInt();
		System.out.println((sum(n)));
		reader.close();
	}
	public static int sum(int n){
		int combos = 0;
		for(int i=0; i<=9; i++){
			for(int j=0; j<=9; j++){
				for (int k=0; k<=9; k++){
					for(int l=0; l<=9; l++){
						if ((i + j + k + l) == n){
							combos++;
						}
					}
				}
			}
		}
		return combos;
	}

}