import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		while(n != 0 || m != 0){
			int max = 0;
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = scan.nextInt();
			}
		
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					int tmp = a[i] + a[j];
					if(tmp > max && tmp <= m){
						max = tmp;
					}
				}
			}
			if(max == 0){
				System.out.println("NONE");
			}else{
				System.out.println(max);
			}
			n = scan.nextInt();
			m = scan.nextInt();
		}
	}
}
