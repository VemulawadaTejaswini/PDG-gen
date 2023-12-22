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
		
		for(int i = 0;i < n;i++){
			int flag = 0;
			int min = 0;
			for(int j = 0;j < 10;j++){
				for(int k = j+1;k < 9;k++){
					if(a[i][j] > a[i][k]){
						if(min == 0){
							min = a[i][k];
						}else if(min > a[i][k]){
							flag++;
							break;
						}else{
							min = a[i][k];
						}
					}
				}
				if(flag > 3){
					System.out.println("NO");
					break;
				}
			}
			if(flag < 4){
				System.out.println("YES");
			}
		}
	}
}