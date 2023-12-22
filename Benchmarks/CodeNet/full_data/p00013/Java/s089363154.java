import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a = new int[9999999];
		int idx = 2;
		a[idx++]=cin.nextInt();
		while(idx!=2){
			int x = cin.nextInt();
			if(x==0){
				System.out.println(a[--idx]);
				continue;
			}
			a[idx++]=x;
			
		}
	}

}