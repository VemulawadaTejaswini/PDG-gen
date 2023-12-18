//ABC13_C


import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.nextLine();

		int arr[] = new int[N];

		for (int i=0; i<N; i++) {

			arr[i] = scan.nextInt();

		}

		int flag =0;
		int preflag = 0;
		int count = 1;

		for(int i=1; i<N; i++) {

			if (arr[i] > arr[i-1]) {
				flag = 1;
			}
			else if (arr[i] == arr[i-1]) {
				continue;
			}
			else {
				flag = -1;
			}

			if(i==1) {
				continue;
			}

			if (arr[i-1] > arr[i-2]) {
				preflag = 1;
			}
			else if (arr[i-1] == arr[i-2]) {
				if(preflag == 0) {
					continue;
				}
			}
			else {
				preflag = -1;
			}

			if(!(flag==preflag)) {
				++count;
				preflag=0;
				for( int j= i-1 ; j >=0; j--) {
					arr[j] = arr[i];
				}
				//System.out.println("count: " + i);
			}
		}

		System.out.println(count);

	}
}

