import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		char[] a = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		for (int i = 0; i < h; i++) {

			for(int j = 0; j < w; j++ ){
			String s = sc.next();


			if(s.equals("snuke")){
				System.out.print(a[j]);
				System.out.println(i+1);
			}
			}

		}


	System.out.println("");

		sc.close();
	}


}
