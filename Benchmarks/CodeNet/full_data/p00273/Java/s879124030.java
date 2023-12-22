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

			if(f_mai<5 && p_mai<2) {
				int btbt=f_mai*furo+p_mai*pool;
				System.out.println(btbt);
			}
			else {
				int matome_min1=Math.min(f_mai/5, p_mai/2);
				if(matome_min1==0) {
					matome_min1=20;
				}
				int matome_min2=Math.max(f_mai/5, p_mai/2);
				if(matome_min2==0) {
					matome_min2=20;
				}

				int tmp_f=f_mai%5;
				if(tmp_f!=0) {
					tmp_f=f_mai/5+1;
				}
				else {
					tmp_f=f_mai/5;
				}

				int tmp_p=p_mai%2;
				if(tmp_p!=0) {
					tmp_p=p_mai/2+1;
				}
				else {
					tmp_p=p_mai/2;
				}
				int matome_max1=Math.min(tmp_p,tmp_f);
				if(matome_max1==0) {
					matome_max1=20;
				}
				int matome_max2=Math.max(tmp_p,tmp_f);
				if(matome_max2==0) {
					matome_max2=20;
				}

				int btbt=f_mai*furo+p_mai*pool;
				int suku1=4*(matome_min1*5*furo+matome_min1*2*pool+Math.max(0,(f_mai-matome_min1*5))*furo+Math.max(0,(p_mai-matome_min1*2))*pool)/5;
				int suku2=4*(matome_min2*5*furo+matome_min2*2*pool+Math.max(0,(f_mai-matome_min2*5))*furo+Math.max(0,(p_mai-matome_min2*2))*pool)/5;
				int oooi1=4*(matome_max1*5*furo+matome_max1*2*pool+Math.max(0,(f_mai-matome_max1*5))*furo+Math.max(0,(p_mai-matome_max1*2))*pool)/5;
				int oooi2=4*(matome_max2*5*furo+matome_max2*2*pool+Math.max(0,(f_mai-matome_max2*5))*furo+Math.max(0,(p_mai-matome_max2*2))*pool)/5;
				int minn1=Math.min(suku1,suku2);
				int minn2=Math.min(oooi1,oooi2);
				int minn3=Math.min(minn1, minn2);
				int res=Math.min(btbt, minn3);
				System.out.println(res);
			}
		}
	}
}
