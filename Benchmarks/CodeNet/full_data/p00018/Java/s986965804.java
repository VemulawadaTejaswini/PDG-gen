import java.util.Arrays;
import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		new Main().run();
	}
	public void run(){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0; i < 5; i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=4; i >= 0; i--){
			System.out.print(a[i]+" ");
		}
	}
}