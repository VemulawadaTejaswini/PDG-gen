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

		for(int i=0; i<=100000; i++) {
			price=i*AB_piza+A_piza*Math.max((A_MAISU-i),0)+B_piza*Math.max((B_MAISU-i),0);
			if(price<min_price) {
				min_price=price;
			}
		}
		System.out.println(min_price);
	}
}