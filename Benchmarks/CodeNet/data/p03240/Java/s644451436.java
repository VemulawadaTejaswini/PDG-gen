import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int data[][] = new int[N][3];
		
		for(int i=0; i<N; i++){
			data[i][0] = sc.nextInt();
			data[i][1] = sc.nextInt();
			data[i][2] = sc.nextInt();
		}
		
		int correct = 1;
		int H = 0;
		loop: for(int i=0; i<101; i++){
			for(int j=0; j<101; j++){
				H = data[0][2] + Math.abs(i - data[0][0]) + Math.abs(j - data[0][1]);
				correct = 1;
				for(int k=0; k<N; k++){
					if(H != data[k][2] + Math.abs(i - data[k][0]) + Math.abs(j - data[k][1])){
						correct = 0;
						break;
					}
				}
				if(correct == 1){
					System.out.println(String.format("%d %d %d", i, j, H));
					break loop;
				}
			}
		}
	}
}