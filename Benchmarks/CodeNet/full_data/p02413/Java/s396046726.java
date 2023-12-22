import java.util.*;
class Main{
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		int gyou = sc.nextInt();	
		int retu = sc.nextInt();
		int[] retuSum = new int[gyou];
		int[] gyouSum = new int[retu];
		int[][] map = new int[gyou][retu];
		for(int i= 0; i < gyou; i++){
			for(int j = 0; j < retu; j++){
				map[i][j] = sc.nextInt();
				gyouSum[j] += map[i][j];
				retuSum[i] += map[i][j];
			}
		}
		for(int i = 0; i < gyou; i++){
			for(int j = 0; j < retu; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println(retuSum);
		}
		for(int i = 0; i < retu; i++){
			System.out.print(gyouSum + " ");
		}
		System.out.println();

	}
}