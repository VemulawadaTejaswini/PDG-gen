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

		for(int i=0; i<=A_MAISU; i++) {
			price=i*AB_piza+A_piza*(A_MAISU-i)+B_piza*(B_MAISU-i);
			if(price<min_price) {
				min_price=price;
			}
		}
		System.out.println(min_price);
	}
}