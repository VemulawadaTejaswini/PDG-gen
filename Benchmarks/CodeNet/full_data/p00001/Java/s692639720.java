import java.util.Arrays;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] str = new int[10];
		
		for(int i=0; i<10; i++){
			str[i] = scan.nextInt();
		}
		Arrays.sort(str);
		for(int j=9; j>6; j--){
			System.out.println(str[j]);
		}
	}
} 