import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int aux=0;
		int suma=0;
		int g=0;
		int k = s.nextInt();
		int[] array = new int[n];
		for(int i =0;i<n;i++) {
			array[i]=s.nextInt();
			
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(array[i]>array[j]) {
					aux = i;
				}else {
					aux = j;
				}
			}
			if(g<k) {
				array[aux]=0;
				g++;
			}
			suma+=array[i];
		}
		System.out.print(suma);
		
		
		
		
		
		
	}
}
