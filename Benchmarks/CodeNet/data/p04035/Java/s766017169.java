import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] a = new int[n];
		for(int i= 0; i<n; i++){
			a[i] = sc.nextInt();
		}
		int pos = -1;
		for(int i=0; i<n-1; i++){
			if(a[i] + a[i+1] >= l){
				System.out.println("Possible");
				pos = i;
				break;
			}
		}
		if(pos == -1){
			System.out.println("Impossible");
		}else{
			for(int i=0; i<pos; i++){
				System.out.println(i+1);
			}
			for(int i=n-2; i>pos; i--){
				System.out.println(i+1);
			}
			System.out.println(pos+1);
		}
	}

}
