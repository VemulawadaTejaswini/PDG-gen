import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] dsh = new int[5];
 		dsh[0] = sc.nextInt();
 		
		dsh[1] = sc.nextInt();
		
		dsh[2] = sc.nextInt();
		
		dsh[3] = sc.nextInt();
		
		dsh[4] = sc.nextInt();
		
		int[] ndsh = new int[5];
		int[] dif = new int[5];
		
		for(int l = 0; l < dsh.length; l++) {
			ndsh[l] = dsh[l];
			dif[l] = 0;
			while((ndsh[l] % 10) != 0) {
				ndsh[l] = ndsh[l] + 1;
				dif[l] = dif[l] + 1;
			}

		}
		
		int max_dif = 0;
		for(int n = 0; n < dif.length; n++) {
			if(max_dif < dif[n]) {
				max_dif = dif[n];
			}
		}
		int sum = ndsh[0] + ndsh[1] + ndsh[2] + ndsh[3] + ndsh[4];
		System.out.println((sum - max_dif));
	}
}