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
				int btbt=furo*f_mai+pool*p_mai;
				System.out.println(btbt);
			}
			else {
				int btbt=furo*f_mai+pool*p_mai;
				int tmp1=Math.min(f_mai/5, p_mai/2);
				int hiku=0;
				if(tmp1>0) {
					hiku=4*(tmp1*(furo*5+pool*2)+Math.max(0, f_mai-tmp1*5)*furo+Math.max(0, p_mai-tmp1*2)*pool)/5;
				}
				else {
					hiku=btbt;
				}

				int f_mmai=f_mai%5;
				int p_mmai=p_mai%2;
				if(f_mmai!=0) {
					f_mmai=f_mai/5+1;
				}
				else {
					f_mmai=f_mai/5;
				}

				if(p_mmai!=0) {
					p_mmai=p_mai/2+1;
				}
				else {
					p_mmai=p_mai/2;
				}

				int tmp2=Math.min(p_mmai,f_mmai);
				int tmp3=Math.max(p_mmai,f_mmai);
				int max_h=0;
				int max_H=0;
				if(tmp2>0) {
					max_h=4*(tmp2*(furo*5+pool*2)+Math.max(0, f_mmai-tmp2*5)*furo+Math.max(0, p_mmai-tmp2*2)*pool)/5;
				}
				else {
					max_h=btbt;
				}
				max_H=4*(tmp3*(furo*5+pool*2))/5;
				//System.out.println(btbt+" "+hiku+" "+max_h+" "+max_H);
				System.out.println(Math.min(Math.min(btbt, hiku), Math.min(max_h, max_H)));
			}
		}
	}
}
