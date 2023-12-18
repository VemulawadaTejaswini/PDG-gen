import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		String ns = s.nextLine();
		String str = s.nextLine();
		int n = Integer.parseInt(ns);
//		String str = "2 3 1";
		int[] arr = new int[n+1]; 
		arr[0] = 0;
		String sss[] = str.split("\\s");
		for(int i=1;i<=n;i++) {

			arr[i] = Integer.parseInt(sss[i-1]);
			
		}
		
		int[] a = new int[n+1];
		
		a[0] = 0;
		
		for(int i=1;i<=n;i++) {
			a[(arr[i])] = i;
		}
		for(int i=1;i<=n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}