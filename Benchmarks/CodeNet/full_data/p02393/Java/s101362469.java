import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//System.out.println("??\???>>");

		Scanner scan = new Scanner(System.in);


		int ary[];
		ary = new int[3];
		for(int i = 0; i < 3 ; i++){

			ary[i] = scan.nextInt();
			//System.out.println(i + ":"  + ary[i]);
		}

		for(int i = 0; i < ary.length; i++ ){

			for(int j = i + 1; j < ary.length; j++){

				if(ary[i] > ary[j]){
					int temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
			System.out.print(ary[i] + " ");
		}


	}

}