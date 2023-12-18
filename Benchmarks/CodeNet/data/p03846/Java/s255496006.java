import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] c = new int[n/2+1];
		for(int i=0;i<n/2+1;i++){
			c[i] = 0;
		}

		for(int i=0;i<n;i++){
			a[i] = scanner.nextInt();
			if(n % 2 == 0){
				c[a[i]/2+1]++;
			}else{
				c[a[i]/2]++;
			}
		}
		boolean check = true;
		for(int i=0;i<c.length;i++){
			if(n % 2 == 0){
				if(c[i] % 2 != 0){
					check = false;
					break;
				}
			}else{
				if(c[0] != 1){
					check = false;
					break;
				}else if(c[i] % 2 != 0 && i != 0){
					check = false;
					break;
				}
			}
		}
		if(check){
			if(n % 2 == 0){
				System.out.println((int)Math.pow(2, (n/2)));
			}else{
				System.out.println((int)Math.pow(2, ((n-1)/2)));
			}
		}else{
			System.out.println(0);
		}

	}

}
