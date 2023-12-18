import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number=sc.nextInt();

		StringBuilder str = new StringBuilder(sc.next());




		int sum=0;

		int z=0;


		//
			while(z<number) {

				int count=0;
				int count2=0;



					while(str.charAt(z)=='#') {
						count++;
						z++;
						if(z>=number) break;}

						if(z>=number) break;
					while(str.charAt(z)=='.') {
						count2++;
						sum++;
						z++;
						if(z>=number) break;
						if(count2<count) break;
					}


					//z--;



	}
			sc.close();
		System.out.print(sum);}

}
