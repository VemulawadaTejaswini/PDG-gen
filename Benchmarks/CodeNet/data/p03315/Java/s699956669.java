import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int k=sc.nextInt();
			int max=9;
			int[] list=new int[k+1];
			for(int i=1; i<=9; i++) {
				list[i-1]=i;
			}
			if(k<=9) {
				for(int i=1; i<=k; i++) {
					System.out.println(k);
				}
			}
			else {
				int n=10;
				int count=9;
				for(int i=20; count<=k; i=i+n) {
					count++;
					if(count%10==8) {
						n=n*10;
					}
					list[count-1]=i-1;
				}
			}
			for(int i=0; i<k; i++) {
				System.out.println(list[i]);
			}
			
		}
	}
}