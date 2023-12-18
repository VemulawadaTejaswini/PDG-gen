import java.util.*;


public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = 3;
			int [][] data = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					data[i][j] = sc.nextInt();
				}
			}
			
//			int [] a = new int[n];
//			int [] b = new int[n];
			boolean flg = false;
			for(int i = 0; i < 101; i++){
				for(int j = 0; j< 101; j++){
					for(int k = 0; k < 101; k++){
						
						if(data[0][0] - i == data[0][1] - j && 
								data[0][0] - i == data[0][2] - k &&
								data[0][1] - j == data[0][2] - k){
							
							if(data[1][0] - i == data[1][1] - j && 
									data[1][0] - i == data[1][2] - k &&
									data[1][1] - j == data[1][2] - k){
								
								if(data[2][0] - i == data[2][1] - j && 
										data[2][0] - i == data[2][2] - k &&
										data[2][1] - j == data[2][2] - k){
									
									flg = true;
									break;
								}
							}
						}
					}
					if(flg) break;
				}
				if(flg) break;
			}
			System.out.println(flg ? "Yes":"No");
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
