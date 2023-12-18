import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		long takahasi=0,nakahasi=0,hikuhasi=0;
		long kaisu=0;
		sc=new Scanner(System.in);

		takahasi=Long.parseLong(sc.next());
		nakahasi=Long.parseLong(sc.next());
		hikuhasi=Long.parseLong(sc.next());
		kaisu=Long.parseLong(sc.next());

		if(takahasi==nakahasi && nakahasi==hikuhasi) {
			System.out.println("0");
			System.exit(0);
		}
		else {
			long tmp1=0,tmp2=0,tmp3=0;
			for(int i=0; i<kaisu; i++) {
				tmp1=takahasi;
				tmp2=nakahasi;
				tmp3=hikuhasi;
				takahasi=tmp2+tmp3;
				nakahasi=tmp1+tmp3;
				hikuhasi=tmp1+tmp2;
			}
		}
		if(Math.abs(takahasi-nakahasi)>1000000000000000000l) {
			System.out.println("Unfair");
		}
		else {
			System.out.println(takahasi-nakahasi);
		}
	}
}