import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a= new int [n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length/2; i++){
			int work;
			work=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=work;
			// TODO Auto-generated method stub
		}
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+" ");
		}

	}

}