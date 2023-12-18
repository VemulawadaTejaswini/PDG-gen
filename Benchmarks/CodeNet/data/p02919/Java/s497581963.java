import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		int[] array_x = new int[n];
		int[] taihi=new int[n];
		int goukei = 0;
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0, k = i; k < n; j++, k++) {
				array_x[j] = array[k];
				  System.arraycopy(array_x,0,taihi,0,array_x.length);//[3]
				Arrays.sort(taihi);
				goukei += taihi[n - 2];
			}
			for(int j=0;j<n;j++){
				array_x[j]=0;
			}
		}
		System.out.println(goukei);

	}
}
