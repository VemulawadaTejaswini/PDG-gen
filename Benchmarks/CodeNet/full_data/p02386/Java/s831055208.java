import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);

		int n;
		
		boolean flag = false;
		
		n = scan.nextInt();
		
		int a[][];
		
		a = new int[n][7];
		
		for(int j = 0; j < n; j++){
			for(int i = 1; i < 7; i++){	
				a[j][i] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(flag) break;
				flag = dice(a[i], a[j]);
			}
		}
		if(flag){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
		
	}
	public static boolean dice(int a[], int b[]){
	int h = 0;
		boolean flag = false;
	

		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 4; j++){
				if(flag == true)break;
					h = a[2];
					a[2] = a[3];
					a[3] = a[5];
					a[5] = a[4];
					a[4] = h;
					flag = Arrays.equals(a,b);

			}
			if(i == 0 || i == 4){
				h = a[1];
				a[1] = a[3];
				a[3] = a[6];
				a[6] = a[4];
				a[4] = h;
			}else{
				h = a[1];
				a[1] = a[2];
				a[2] = a[6];
				a[6] = a[5];
				a[5] = h;
			}
		}
		
		return flag;
	}
	
}