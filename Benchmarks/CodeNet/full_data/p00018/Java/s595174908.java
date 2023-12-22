import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ints = new int[5];
		for(int i=0; i<5;i++){
			ints[i]=sc.nextInt();
		}
		Arrays.sort(ints);
		int[] ints2 = new int[5];
		for(int i=0; i<ints.length; i++){
			ints2[4-i]=ints[i];
		}
		int a=0;
		while(a<4){
		System.out.print(ints2[a]+" ");
		a++;
		}
		System.out.println(ints2[4]);
	}
}