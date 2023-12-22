import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] m=new int[10];
		for(int i=0; i<10; i++){
			m[i]=sc.nextInt();
		}
		Arrays.sort(m);
		for(int i=9; i>=7; i--){
			System.out.println(m[i]);
		}
	}

}