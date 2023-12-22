import java.util.Scanner;
class Main {
	private static int[] k = new int[100];
	public void kami() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int x = 1; x <= n; x++){
			 k[x] = sc.nextInt();
		}
		for(int i = n; i >= 2; i--){
			for(int j = n - 1; j >= 1; j--){
				if(j < i){
					int work = k[j];
					k[j] = k[i];
					k[i] = work;
				}
			}
		}
		for(int i = 1; i <= n; i++){
			System.out.print(k[i] + " ");
		}
	}

	public static void main(String[] args) {

		new Main().kami();
	}

}