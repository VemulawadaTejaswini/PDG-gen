import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			double[] x_pos = new double[N];
			double[] y_pos = new double[N];
			
			for(int i = 0; i < N; i++){
				String[] str = sc.next().split(",");
				x_pos[i] = Double.parseDouble(str[0]);
				y_pos[i] = Double.parseDouble(str[1]);
			}
			
			int max = 0;
			for(int i = 0; i < N; i++){
				int count = 0;
				
				for(int j = 0; j < N; j++){
					if(i == j){
						count++;
					}else if(((x_pos[i] - x_pos[j]) * (x_pos[i] - x_pos[j])) + ((y_pos[i] - y_pos[j]) * (y_pos[i] - y_pos[j])) <= 4){
						count++;
					}
				}
				
				max = Math.max(max, count);
			}
			
			System.out.println(max);
		}

	}

}