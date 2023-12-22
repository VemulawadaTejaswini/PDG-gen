import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a=new int[5];
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=a.length-1; i>=0; i--){
			System.out.printf("%d ",a[i]);
		}


		}

}