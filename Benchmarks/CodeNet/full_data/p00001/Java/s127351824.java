import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int[] data = new int[10];
		for(int i=0;i<10;i++){
			int h = Integer.parseInt(sc.nextLine());
			data[i] = h;
		}
		Arrays.sort(data);
		for(int i=9;i>6;i--){
			System.out.println(data[i]);
		}
	}
}