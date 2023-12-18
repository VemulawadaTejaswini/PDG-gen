import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] coor = new int[N+2];
		
		coor[0] = 0;
		coor[N+1] = 0;
		for (int i=1; i<=N; i++){
			coor[i] = sc.nextInt();
		}
		int[] temp = new int [N+1];
		for (int i=1; i<=N; i++){
			int total = 0;
			for (int j=0; j<=N; j++){
				if (j>=i){
					temp[j] = coor[j+1];
				}else{
					temp[j] = coor[j];
				}
			}
			for (int j=1; j<=N; j++){
				total+=Math.abs(temp[j]-temp[j-1]);
			}
			
			System.out.println(total);	
		}

	}

}