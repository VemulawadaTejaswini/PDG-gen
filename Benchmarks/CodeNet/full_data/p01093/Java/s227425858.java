import java.util.Arrays;
import java.util.Scanner;

public class Main {
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			while(true){
				int s=50000;
				int n;
				n= scan.nextInt();
				if(n==0){
					break;
				}
				int[] a = new int[n];
				for(int i=0;i<n;i++){
					a[i]=scan.nextInt();
				}
				Arrays.sort(a);
				for(int i=1;i<n;i++){
					int h=0;
						h = a[i]-a[i-1];
						if(h<s){
							s=h;
						}
				}
				System.out.println(s);
			}
		}
}

