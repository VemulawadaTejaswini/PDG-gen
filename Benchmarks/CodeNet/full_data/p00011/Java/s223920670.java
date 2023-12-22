import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(",|//s|\n");
		int w = Integer.parseInt(scan.next());
		int n = Integer.parseInt(scan.next());
		int[] number = new int[w];
		for( int i = 0; i < w; i++){
			number[i] = i+1;
		}
		for( int i = 0; i < n; i++ ){
			int a = Integer.parseInt(scan.next()) - 1;
			int b = Integer.parseInt(scan.next()) - 1;
			int temp = number[a];
			number[a] = number[b];
			number[b] = temp;
		}
		System.out.print(number[0]);
		for( int i = 1; i < w; i++ ){
			System.out.printf(" %d", number[i]);
		}
		System.out.println();
		return;
	}
}