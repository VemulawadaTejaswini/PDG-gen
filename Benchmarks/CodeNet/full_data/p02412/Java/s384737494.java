import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int a = 1;a>0;a++){
			int n =scan.nextInt();
			int x = scan.nextInt();
			int H = 0;
			if(n == 0 && x == 0){
				break;
			}
			int k[] = new int[n];
			for(int b = 0;b<n;b++){
				k[b] = b+1;
			}
			for(int c = 0;c<n-2;c++){
				for(int d = 1;d+c<n;d++){
					for(int e = 1;e+d+c<n;e++){
						if(k[c] + k[d+c] + k[e+d+c] == x){
							H++;
						}
					}
				}
			}
			System.out.println(H);
		}
	}

}