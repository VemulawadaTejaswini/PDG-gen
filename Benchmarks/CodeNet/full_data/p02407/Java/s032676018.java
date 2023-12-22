
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n,i,copy;
		n=stdIn.nextInt();
		int[] a=new int[n];
		for(i=0;i<a.length;i++){
			a[i]=stdIn.nextInt();
		}
		for(i=0;i<a.length/2;i++){
			copy=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=copy;
		}
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		stdIn.close();
	}
}

