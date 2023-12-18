import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int mochi [] = new int [N];
		for(int m = 0; m<N; m++){
	        mochi[m]=scan.nextInt();
	    }

		//bubble sort
		int count = 0;
		for(int i =0; i<mochi.length-1; i++){
			for(int j = mochi.length-1; j>i; j--){
				if(mochi[j-1]>mochi[j]){
					int temp = mochi[j-1];
					mochi[j-1] = mochi[j];
					mochi[j] = temp;
					count++;
				}
			}

		}
		//System.out.println(Arrays.toString(mochi));

		int check = 0;
		for(int i = 0; i <mochi.length-1; i++){
			if(mochi[i]<mochi[i+1]){
				check++;
			}
		}
		System.out.println(check + 1);



	}

}
