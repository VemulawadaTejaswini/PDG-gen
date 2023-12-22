import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int[] bil,bil2;
		bil = new int[4];
		bil2 = new int[4];
		for(int i = 1; i <= 3; i++){
			bil[i] = reader.nextInt();
		}
		for(int i = 1; i <= 3; i++ ){
			for(int j = 1; j <=3; j++){
				if(bil[i] < bil[j]){
					bil2[i] = bil[j];
				}
			}
		}
		for(int i = 1; i <=3; i++){
			System.out.println(bil2[i]);
		}
	}
}