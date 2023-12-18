import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				c[i][j] = sc.nextInt();
			}
		}
		int[] a = new int[3];
		int[] b = new int[3];
		for(int i = 0; i < 3; i++){
			a[i] = Math.min(c[i][0],Math.min(c[i][1],c[i][2]));
		}
		for(int i = 0; i < 3; i++){
			b[i] = Math.min(c[0][i],Math.min(c[1][i],c[2][i]));
		}
		boolean flag = true;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(a[i]+b[j] != c[i][j]){
					flag = false;
				}
			}
		}
		/*for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < 3; i++){
			System.out.print(a[i]);
		}
		for(int i = 0; i < 3; i++){
			System.out.print(b[i]);
		}*/
		if(flag){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
}
