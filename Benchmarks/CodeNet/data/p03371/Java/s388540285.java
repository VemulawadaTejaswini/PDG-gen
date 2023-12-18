import java.util.Scanner;

class Main{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A_piza=sc.nextInt();
		int B_piza=sc.nextInt();
		int AB_hpiza=sc.nextInt();
		int A_MAISU=sc.nextInt();
		int B_MAISU=sc.nextInt();
		int AB_Apiza=AB_hpiza;
		int AB_Bpiza=AB_hpiza;
		int price=0;
		boolean A_cheaper=false;
		boolean B_cheaper=false;

		//System.out.println("1st ok");

		if(AB_Apiza<A_piza) {
			A_cheaper=true;		// コンビピザのほうが安い
		}

		if(AB_Apiza<B_piza) {
			B_cheaper=true;		// コンビピザのほうが安い
		}

		//System.out.println("2nd ok");

		if(A_cheaper==true && B_cheaper==true) {
			price=AB_hpiza*Math.max(A_MAISU,B_MAISU)*2;
		}

		else if(A_cheaper==false && B_cheaper==false) {
			price=A_piza*A_MAISU+B_piza*B_MAISU;
		}

		else if(A_cheaper==false && B_cheaper==true) {
			if(A_MAISU>=B_MAISU) {
				int a=AB_hpiza*A_MAISU*2;
				int b=AB_hpiza*B_MAISU*2+A_piza*(A_MAISU-B_MAISU);
				int c=A_MAISU*A_piza+B_MAISU*B_piza;

				price = Math.min(a, Math.min(b,c));
			}

			else if(A_MAISU<=B_MAISU) {
				int a=AB_hpiza*A_MAISU*2;
				int b=AB_hpiza*A_MAISU*2+A_piza*(B_MAISU-A_MAISU);
				int c=A_MAISU*A_piza+B_MAISU*B_piza;

				price = Math.min(a, Math.min(b,c));
			}

			else if(A_cheaper==true && B_cheaper==false) {
				if(A_MAISU>=B_MAISU) {
					int a=AB_hpiza*A_MAISU*2;
					int b=AB_hpiza*B_MAISU*2+A_piza*(A_MAISU-B_MAISU);
					int c=A_MAISU*A_piza+B_MAISU*B_piza;

					price = Math.min(a, Math.min(b,c));
				}

				else if(A_MAISU<=B_MAISU) {
					int a=AB_hpiza*A_MAISU*2;
					int b=AB_hpiza*A_MAISU*2+A_piza*(B_MAISU-A_MAISU);
					int c=A_MAISU*A_piza+B_MAISU*B_piza;

					price = Math.min(a, Math.min(b,c));
				}
			}
		}

		else if(A_cheaper==true && B_cheaper==false) {
			if(A_MAISU>=B_MAISU) {
				int a=AB_hpiza*A_MAISU*2;
				int b=AB_hpiza*B_MAISU*2+A_piza*(A_MAISU-B_MAISU);
				int c=A_MAISU*A_piza+B_MAISU*B_piza;

				price = Math.min(a, Math.min(b,c));
			}

			else if(A_MAISU<=B_MAISU) {
				int a=AB_hpiza*A_MAISU*2;
				int b=AB_hpiza*A_MAISU*2+A_piza*(B_MAISU-A_MAISU);
				int c=A_MAISU*A_piza+B_MAISU*B_piza;

				price = Math.min(a, Math.min(b,c));
			}

			else if(A_cheaper==true && B_cheaper==false) {
				if(A_MAISU>=B_MAISU) {
					int a=AB_hpiza*A_MAISU*2;
					int b=AB_hpiza*B_MAISU*2+A_piza*(A_MAISU-B_MAISU);
					int c=A_MAISU*A_piza+B_MAISU*B_piza;

					price = Math.min(a, Math.min(b,c));
				}

				else if(A_MAISU<=B_MAISU) {
					int a=AB_hpiza*A_MAISU*2;
					int b=AB_hpiza*A_MAISU*2+A_piza*(B_MAISU-A_MAISU);
					int c=A_MAISU*A_piza+B_MAISU*B_piza;

					price = Math.min(a, Math.min(b,c));
				}
			}
		}
		//System.out.println("3rd ok");

		System.out.println(price);
	}
}