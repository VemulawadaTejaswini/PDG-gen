import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		long D = scan.nextLong();
		long C1 = C;
		long count0 = 0;
		long count1 = 0;
		long count2 = 0;
		boolean X = true;
		while(X) {
			if(D%C1!=0){
				C1 = D%C1;
			}else{
				X = false;
			}
		}
		long D1 = D/C1;
		long Y = D1*C;


		for(long i=1;;i++) {
			if((A<=Y*i)&&(Y*i<=B)) {
				count0++;
			}else if(Y*i>B) {
				break;
			}
		}

		for(long i=1;;i++) {
			if((A<=C*i)&&(C*i<=B)) {
				count1++;
			}else if(C*i>B) {
				break;
			}
		}
		for(long i=1;;i++) {
			if((A<=D*i)&&(D*i<=B)) {
				count2++;
			}else if(D*i>B) {
				break;
			}
		}


		System.out.println(B-A-(count1+count2-count0)+1);

	}

}
