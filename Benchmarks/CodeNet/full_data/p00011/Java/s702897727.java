import java.util.Scanner;

class Main{

	public static void main(String [] args) {

		int i,j;
		int count;
		int a,b;
		int temp;

		Scanner sc = new Scanner(System.in);


			i = sc.nextInt();

			int[] location;
			location = new int[i];


			for(j = 0; j < i; j++) {

				location[j] = j + 1;

			}


			count = sc.nextInt();

			while(sc.hasNext()) {
				for(j = 1; j <= count ; j++ ) {


				a = sc.nextInt();
				b = sc.nextInt();

				temp = location[b-1];
				location[b-1] = location[a-1];
				location[a-1] = temp;

				}


		for (j = 0; j < i; j++) {

			System.out.println(location[j]);
		}
			}


	}

}