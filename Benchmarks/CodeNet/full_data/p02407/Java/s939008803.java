import java.util.Scanner;
class Main {
    int x,i,j;
	private static int[] k = new int[100];
	public void kami() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n <= 100){
			for(x = 1; x <= n; x++){
				 k[x] = sc.nextInt();
			}
			for(i = n; i >= 2; i--){
				for(j = n - 1; j >= 1; j--){
					if(j < i){
						int work = k[j];
						k[j] = k[i];
						k[i] = work;
					}
				}
			}
			for(i = 1; i <= n - 1; i++){
				System.out.print(k[i] + " ");
			}
			System.out.println(k[n]);
		}
	}

	public static void main(String[] args) {

		new Main().kami();
	}

}