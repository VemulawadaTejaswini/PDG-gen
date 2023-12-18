import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number=sc.nextInt();

		String str = new String();

		int smallest=10000;



			str=sc.next();

		int k;
		int count;
		for(int j=0;j<number+1;j++) {

			count=0;

		//	k=j;
			for(int z=0;z<number;z++) {

				if(z<=number-j-1) {
					if(str.charAt(z)!='.')
					{count++;}
				}
				else {
					if(str.charAt(z)!='#') {
						count++;
					}
					}

			}

			if(count<smallest){
				smallest=count;

		}

	}
		System.out.print(smallest);

}
}
