import java.util.Scanner;

class Main {
	static Scanner scan = new Scanner(System.in);
	static int N = scan.nextInt();
	static int[] A = new int[N];
	static int change = 0;
	
	public static void main(String[] args) {
		Main main = new Main();
		//ループのカウント
		int count = 0;
		//配列に値を代入
		while(count < Main.N){
			Main.A[count] = scan.nextInt();
			count++;
		}
		
		for (int i = 0;i < Main.N-1;i++){
			int mini = 0;
			mini=i;
			for(int j = i;j < Main.N-1;j++){
				if(Main.A[j] < Main.A[mini]){
					mini = j;
					main.swap(i,mini);
					Main.change++;
				}
			}	
		}
		main.call();
		System.out.println();
		System.out.print(Main.change);
	}
	
	public void swap(int i,int j){
		//添字iと添字jの配列の値を入れ替える
		int m = 0;
		m = Main.A[i];
		Main.A[i] = Main.A[j];
		Main.A[j] = m;
		
	}
	
	public void call(){
		int i = 0;
		while(i<Main.N){
			System.out.print(Main.A[i]);
			if(i < Main.N - 1){
			System.out.print(" ");
			}
			i++;
		}
	}
	
	
}