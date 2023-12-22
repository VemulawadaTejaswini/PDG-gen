import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????


		Scanner scan = new Scanner(System.in);


		//scan.close();

		while(scan.hasNext()){

			int n = scan.nextInt();
			for(int i = 3; i <= n; i++){

				if(i % 3 == 0 || i % 10 == 3){

					
					System.out.print(i);
					
					if( i != n){					
						System.out.print(" ");				
					}else{
						System.out.println("");
					}
				}
			}
		}
	}
}