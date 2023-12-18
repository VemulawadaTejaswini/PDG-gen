import java.util.Scanner;
import java.util.Arrays;


class Main {
	
	public static class cityname {
		int location = 0;
		int year = 0;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
					
		cityname[] city = new cityname[M];
		int[][] order  = new int[N][M];
		int[] order_index = new int[N];
		
		for (int i = 0; i < M ;i++){
			city[i] =  new cityname();
			city[i].location = scan.nextInt()-1;
			city[i].year = scan.nextInt();
			order[city[i].location][order_index[city[i].location]] = city[i].year;
			order_index[city[i].location]++;
		}
		
		for (int i = 0; i < N ;i++){
			Arrays.sort(order[i]);
		}
		
		for  (int i = 0; i < M ;i++){
			int index = 0 ;
	
			while(city[i].year != order[city[i].location][index] ){
				index++;
			}	
			System.out.println(String.format("%06d", city[i].location+1)+String.format("%06d", index+1));
		}
	}
}