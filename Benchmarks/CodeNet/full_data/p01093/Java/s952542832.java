import java.util.Arrays;
import java.util.Scanner;

public class Main {
		public static void main(String[] args){
			int s=50000;
			while(true){
				Scanner scan = new Scanner(System.in);
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

				for(int i=0;i<n;i++){
					int h=0;
					if(i!=n-1){
						h = a[i]-a[i+1];
						if(h<=-1){
							h=h*-1;
						}
						if(h<s){
							s=h;
						}
					}
				}
				System.out.println(s);
			}
			System.out.println(s);
		}
}

