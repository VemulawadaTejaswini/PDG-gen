import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj1193().doIt();
	}
	class aoj1193{
		int a[][];
		int point(int n){
			int result = 0;
			for(int i = 0;i < n;i++){
				if(a[i][0] == a[i][1] && a[i][1] == a[i][2] && a[i][2] == a[i][3] && a[i][3] == a[i][4] && a[i][0] != 0){
					result = result + (a[i][0] * 5);
					for(int j = 0;j < 5;j++)a[i][j] = 0;
				}
				for(int j = 0;j < 2;j++){
					if(a[i][j] == a[i][j+1] && a[i][j+1] == a[i][j+2] && a[i][j+2] == a[i][j+3] && a[i][j] != 0){
						result = result + (a[i][j] * 4);
						for(int k = j;k < j + 4;k++)a[i][k] = 0;
					}
				}
				for(int j = 0;j < 3;j++){
					if(a[i][j] == a[i][j+1] && a[i][j+1] == a[i][j+2] && a[i][j] != 0){
						result = result + (a[i][j] * 3);
						for(int k = j;k < j + 3;k++)a[i][k] = 0;
					}
				}
			}
			return result;
		}
		void sort(int n){
			while(true){
				boolean s = false;
				for(int i = n-1;i > 0;i--){
					for(int j = 0;j < 5;j++){
						if(a[i][j] == 0 && a[i-1][j] != 0){
							a[i][j] = a[i-1][j];
							a[i-1][j] = 0;
							s = true;
						}
					}
				}
				if(!s)break;
			}
		}
		void doIt() {
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int cnt = 0;
				a = new int [n][5];
				for(int i = 0;i < n;i++){
					for(int j = 0;j < 5;j++){
						a[i][j] = sc.nextInt();
					}
				}
				while(true){
					int num = point(n);
					cnt = cnt + num;
					if(num == 0)break;
					sort(n);
				}
				System.out.println(cnt);
			}
		}
	}
}