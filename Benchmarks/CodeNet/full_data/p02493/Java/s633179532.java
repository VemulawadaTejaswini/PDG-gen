import java.util.Scanner;
public class Main {

	static int[] reverse(int[] a) {
		int[] b = new int[a.length];
		 for(int r = 0; r < a.length; r++)
			 b[r] = a[a.length - 1 - r];
		 return(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner stdIn = new Scanner(System.in);
			
			int num = stdIn.nextInt();
			int[] a = new int[num];
			for(int r = 0; r < a.length; r++)
				a[r] = stdIn.nextInt();
			int[] b = reverse(a);
			for(int r = 0; r < b.length; r++) {
				System.out.print(b[r]);
				if(r == b.length - 1)
					System.out.println();
				else
					System.out.print(" ");
			}
	}

}