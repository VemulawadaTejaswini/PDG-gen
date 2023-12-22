
import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int i;
	int n = s.nextInt();
	if(n<=100){
	int[] a = new int[100];
	
	//nまでの値を配列へ
	for(i=0; i<n; i++){
		a[i] = s.nextInt();
	}
	//入れ替え
	for(i=0; i<(n/2); i++){
		int change = a[i];
		a[i] = a[n-i-1];
		a[n-i-1] = change;
	}
	
	for(i=0; i<n; i++){
		System.out.print(a[i]+" " );
	}
	}
	}
}