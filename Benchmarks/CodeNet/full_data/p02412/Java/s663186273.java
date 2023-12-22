import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				int n = sc.nextInt();
				int x = sc.nextInt();
				if(n==0&&x==0) break;
				int num = 0;	//出力
				for(int i=1;i < n - 1;i++) {
					for(int j = i+1;j < n;j++) {
						for(int k = j+1;k < n + 1;k++) {
							if((i+j+k)==x)
								num++;
						}
					}
				}
				System.out.println(num);
			}
		}
	}
}

