import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int N;
	static int M;
	static boolean flag;
	static int ans;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int A =sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int ans = 0;
		int[] data = {A,B,C};
		Arrays.sort(data);
		
		
		
		
		int max = data[2];
		int mid = data[1];
		int min =data[0];
		
		ans = 0;
		while(true){
			
			
			
						
			if(min == mid){
				min++;
				mid++;
			}else{
				min = min +2;
			}
			
			ans++;
			
			if(max == mid&& min == mid){
				System.out.println(ans);
				return;
			}
			
			data[0] = max;
			data[1] = mid;
			data[2] = min;
			Arrays.sort(data);
			  min = data[0];
			mid = data[1]  ;
			 max = data[2] ;
			
			
			
		}


	}


}

class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



