import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int days=sc.nextInt();

		for(int i=0; i<days; i++) {
			int furo=sc.nextInt();
			int pool=sc.nextInt();
			int f_mai=sc.nextInt();
			int p_mai=sc.nextInt();

			int matome0=furo*f_mai+pool*p_mai;
			int matome1=4*(furo*5+pool*2+Math.max(f_mai-5, 0)*furo+Math.max(p_mai-2, 0)*pool)/5;
			int matome2=4*(furo*10+pool*4+Math.max(f_mai-10, 0)*furo+Math.max(p_mai-4, 0)*pool)/5;
			int matome3=4*(furo*15+pool*6+Math.max(f_mai-15, 0)*furo+Math.max(p_mai-6, 0)*pool)/5;
			System.out.println(Math.min(Math.min(matome0, matome1), Math.min(matome2, matome3)));
		}
	}
}
