import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a  = new int[3];
		int[] b = new int[2];
		for(int i = 0; i < 3;i++){
			a[i]=cin.nextInt();
		}
		b[0]=cin.nextInt();
		b[1]=cin.nextInt();
		int min = 99999999;
		for(int i = 0; i < 3;i++){
			for(int j = 0; j < 2;j++){
				if(min > a[i]+b[j]){
					min = a[i]+b[j];
				}
			}
		}
		System.out.println(min-50);
	}

}