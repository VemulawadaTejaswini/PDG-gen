import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] in = new int [N][3];
		int [] out = new int [N];
		int c = 0;
		
		for(int i = 0; i < N; i++){
			out[i] = 0;
		}
		for(int j = 0; j < N; j++){
			for(int k = 0; k < 3; k++){
				in[j][k] = sc.nextInt();
		}
	}
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < N; j++){
				c = 0;
				for(int k = 0; k < N; k++){
					if(j != k){
						if(in[j][i] == in[k][i]){
							in[k][i] = 0;
							c = 1;
						}
						if(k == N-1){
							if(c == 1){
								in[j][i] = 0;
							}
						}
					}
				}
			}
		}
		for(int j = 0; j < 3; j++){
			for(int i = 0; i < N; i++){
				out[i] += in[i][j];
			}
		}
		for(int i = 0; i < N; i++){
			System.out.println(out[i]);
		}
		// TODO Auto-generated method stub
	}

}