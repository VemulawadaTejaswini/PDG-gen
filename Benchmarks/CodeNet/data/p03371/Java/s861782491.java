import java.util.Scanner;

class Main{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A_piza=sc.nextInt();
		int B_piza=sc.nextInt();
		int AB_piza=sc.nextInt()*2;		//AB1枚
		int A_MAISU=sc.nextInt();
		int B_MAISU=sc.nextInt();
		int price=0;
		int min_price=114514810;
		if(A_piza>=AB_piza && B_piza>=AB_piza) {
			min_price=AB_piza*Math.max(A_MAISU, B_MAISU);
		}

		else if(A_piza>=AB_piza && B_piza<=AB_piza) {
			min_price=AB_piza*A_MAISU+Math.max(0, B_MAISU-A_MAISU)*B_piza;
		}

		else if(A_piza<=AB_piza && B_piza>=AB_piza) {
			min_price=AB_piza*B_MAISU+Math.max(0, A_MAISU-B_MAISU)*A_piza;
		}
		/*else {
			for(int i=0; i<=A_MAISU; i++) {
				for(int j=0; j<=B_MAISU; j++) {
					price=i*A_piza+j*B_piza+Math.max(A_MAISU-i, B_MAISU-j)*AB_piza;
					if(min_price>price) {
						min_price=price;
					}
				}
			}
		}*/
		System.out.println(min_price);

	}
}