import java.util.Arrays;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		char[] fukuro = new char[N];
		boolean[] judge = new boolean[4];
		int count = 0;

		for(int i = 0;i < N;i++){
			fukuro[i] = scan.next().charAt(0);
		}

		Arrays.fill(judge, false);

		for(int i= 0;i < N;i++){
			if(fukuro[i] == 'P'){
				judge[0] = true;
			}
			if(fukuro[i] == 'W'){
				judge[1] = true;
			}
			if(fukuro[i] == 'G'){
				judge[2] = true;
			}
			if(fukuro[i] == 'Y'){
				judge[3] = true;
			}
		}
		for(int i=0;i < 4;i++){
			if(judge[i]){
				count++;
			}
		}

		if(count==3){
			System.out.println("Three");

		}else{
			System.out.println("Four");
		}


	}






}
