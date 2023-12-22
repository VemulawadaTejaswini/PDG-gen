import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = -1;
		while(true){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[][] a = new int[n][2];
			int[] b = new int[2];
			b[0] = 0;
			b[1] = 0;
			for(int j = 0;j < n;j++){
				for(int k = 0;k < 2;k++){
					a[j][k] = scan.nextInt();
				}
			}
			for(int j = 0;j < n;j++){
				if(a[j][0] == a[j][1]){
					b[0] += a[j][0];
					b[1] += a[j][1];
				}else if(a[j][0] > a[j][1]){
					b[0] += a[j][0] + a[j][1];
				}else{
					b[1] += a[j][0] + a[j][1];
				}
			}
			System.out.println(b[0] + " " + b[1] +"\n");
		}	
	}
}