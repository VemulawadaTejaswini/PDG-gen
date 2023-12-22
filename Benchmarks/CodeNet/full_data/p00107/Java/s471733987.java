import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int[] a = new int[3];
			a[0] = cin.nextInt();
			a[1]= cin.nextInt();
			a[2] = cin.nextInt();
			if(a[0]+a[1]+a[2]==0){
				break;
			}
			Arrays.sort(a);
			double len = Math.sqrt(a[0]*a[0]+a[1]*a[1]);
			int N = cin.nextInt();
			while(N--!=0){
				int c = cin.nextInt();
				if(c*2 > len){
					System.out.println("OK");
				}
				else{
					System.out.println("NA");
				}
			}
		}
	}

}