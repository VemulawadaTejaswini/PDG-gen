import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] odd = new int[n/2];
		int[] even = new int[n/2];

		for(int i = 0 ; i < n ; i++){
			if(i%2 != 0){
				odd[i/2] = sc.nextInt();
			}
			else{
				even[i/2] = sc.nextInt();
			}
		}

		sc.close();

		int[][] checkodd = new int[100001][2];
		int[][] checkeven = new int[100001][2];

		for(int i = 0 ; i < n/2 ; i++){
			checkodd[odd[i]][0] = odd[i];
			checkodd[odd[i]][1] += 1;
			checkeven[even[i]][0] = even[i];
			checkeven[even[i]][1] += 1;
		}

	    Arrays.sort(checkodd, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            //return o1[0] - o2[0];    //[0] をキーにソート(昇順)
	            return o2[0] - o1[0];    //[0] をキーにソート(降順)
	        }
	    });
	    Arrays.sort(checkeven, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            //return o1[0] - o2[0];    //[0] をキーにソート(昇順)
	            return o2[0] - o1[0];    //[0] をキーにソート(降順)
	        }
	    });

/*
		for(int i = 0 ; i < 10 ; i++){
			for(int j = 0 ; j < 2 ; j++){
				System.out.print(checkodd[i][j] +" ");
			}
			System.out.println();
		}
*/


	    int oddmax = checkodd[0][1];
	    int oddp = checkodd[0][0];
	    int oddsecond = checkodd[1][1];
	    int oddpsecond = checkodd[0][1];

	    int evenmax = checkeven[0][1];
	    int evenp = checkeven[0][0];
	    int evensecond = checkeven[1][1];
	    int evenpsecond= checkeven[0][1];

		int ans = 0;

		if(oddmax == n/2 && evenmax == n/2){
			if(oddp == evenp){
				System.out.println(n/2);
			}
			else{
				System.out.println(0);
			}
		}

		else if(oddmax == n/2){
			if(oddp == evenp){
				System.out.println((n/2)-evensecond);
			}
			else{
				System.out.println((n/2)-evenmax);
			}
		}
		else if(evenmax == n/2){
			if(oddp == evenp){
				System.out.println((n/2)-oddsecond);
			}
			else{
				System.out.println((n/2)-oddmax);
			}
		}
		else{
			if(oddp == evenp){
				if(evensecond>oddsecond){
					System.out.println(n-oddmax-evensecond);
				}
				else{
					System.out.println(n-oddsecond-evenmax);
				}
			}
			else{
				System.out.println(n-oddmax-evenmax);
			}
		}
	}
}