import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Y = scanner.nextInt();
int num = 0;
		for(int i = 0;i < N+1;i++){
			for(int j = 0;j < N+1;j++){
				for(int l = 0;l < N+1;l++){
					num = i + j + l;
					if(1000*i + 5000*j + 10000*l == Y  && num == N){
						System.out.println(l+" "+j+" "+i);
						return;
					}
				}

			}

		}
		System.out.println(-1+" "+-1+" "+-1);

	}
}
