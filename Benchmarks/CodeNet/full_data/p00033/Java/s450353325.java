import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][10];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < 10;j++){
				a[i][j] = scan.nextInt();
			}
		}
		boolean flag;
		int min;
		for(int i = 0;i < n;i++){
			flag = true;
			min = 0;
			for(int j = 0;j < 9;j++){
				if(a[i][j] > a[i][j+1]){
					if(min > a[i][j+1]){
						flag = false;
						break;
					}else{
						min = a[i][j+1];
					}
				}
			}
			if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}