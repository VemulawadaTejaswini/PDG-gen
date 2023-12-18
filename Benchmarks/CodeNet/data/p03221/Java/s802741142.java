import java.util.Arrays;
import java.util.Scanner;

public class Main{

	static int N;
	static int M;
	static long [][] Copy;
	static String [] Area;
	static long [] Pi;
	static long [] Yi;

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Copy = new long [M][2];
		Area = new String [M];
		Pi = new long[M];
		Yi = new long[M];
		
		for(int i=0;i<M;i++) {
			Copy[i][0] = sc.nextInt();
			Copy[i][1] = sc.nextInt();
		}
		long [] arr = new long [M];
        long math = (long) Math. pow(10,10);
		for(int i =0;i<M;i++) {
			arr[i] = Copy[i][0] * math + Copy[i][1];
		}
		Arrays.sort(arr);
		Pi[0] = arr[0] /math;
		Yi[0] = arr[0]%math;
		Area[0] = String.format("%06d",Pi[0]) + String.format("%06d",1);
		int index = 1;
		for(int i=1;i<M;i++) {
			Pi[i] = arr[i] / math;
			Yi[i] = arr[i] % math;
			if(Pi[i] != Pi[i-1]){
				index = 1;
				Area[i] = String.format("%06d",Pi[i]) + String.format("%06d",index);
			}else{
				index++;
				Area[i] = String.format("%06d",Pi[i]) + String.format("%06d",index);
			}
		}

		for(int i=0;i<M;i++) {
			for(int j=0;j<M;j++) {
				if(Copy[i][1] == Yi[j]) {
					System.out.println(Area[j]);
					break;
				}
			}
		}
		
		
	}

}