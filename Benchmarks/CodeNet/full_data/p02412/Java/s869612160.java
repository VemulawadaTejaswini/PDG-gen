

import java.util.Scanner;


public class Main{

	public static int  Clc(int N , int X) {
		int count = 0;
		for(int x = 1; x <= N ; x++){
			for(int y = x+1; y <= N ; y++){
				if(x==y){break;}
				for(int z =y+1 ; z <= N ; z++){
					if(x==z || y == z){break;}
						if((x+y+z)==X){count++;}
				}
			}
		}

		return count;


	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;

		while(true){
			int N = scanner.nextInt();
			int X = scanner.nextInt();
			if(N == 0 && X == 0){break;}
			count = Clc(N, X);
			System.out.println(count);
		}
		scanner.close();
	}


}