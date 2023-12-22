import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10000];
				for(int i = 0 ; i<10000 ; i++){
					a[i]=scan.nextInt();
					if(a[i]==0) break;
					}
				
		for(int i = 0 ; i<10000 ; i++){
			if(a[i]==0) break;
		System.out.println("Case "+(i+1)+": "+a[i]);
		}
	}


}