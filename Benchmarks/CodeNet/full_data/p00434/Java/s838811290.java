//Volume5-0511
import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		final int   N       = 31;
		      int[] student = new int[N],
		    		yet     = new int[2];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<28;i++){
			student[sc.nextInt()]++;
		}
		for(int i=1,j=0;i<31;i++){
			if(student[i]==0){
				yet[j] = i;
				j++;
			}
		}
		Arrays.sort(yet);
		System.out.printf("%d\n%d\n",yet[0],yet[1]);
	}
}