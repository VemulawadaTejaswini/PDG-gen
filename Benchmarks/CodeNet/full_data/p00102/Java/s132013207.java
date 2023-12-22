import java.util.Scanner;

class Main{


	public static void main(String[] a){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();





		while(sc.hasNext()) {
			if(n == 0) {break;}



			int[][] data = new int[n+1][n+1];


			for(int i = 0; i < n; i++) {
				int sum = 0;
				for(int j = 0; j < n; j++) {

	 					data[i][j] = sc.nextInt();
	 					sum += data[i][j];
				}
				data[i][data.length -1] = sum;
			}

			for(int i = 0; i < n; i++) {
				int sum = 0;
				for(int j = 0; j < n; j++) {

	 					sum += data[j][i];
				}
				data[data.length -1][i] = sum;
			}

			int sum = 0;
			for(int i = 0; i < data.length; i++) {

				sum += data[data.length -1][i];
			}
			data[data.length -1][data.length -1] = sum;


			for(int i = 0; i < data.length; i++) {
				String str = "";
				for(int j = 0; j < data.length; j++) {

	 				str += String.format("%5s",data[i][j]);

				}
				System.out.println(str);
			}

		}



	}
}