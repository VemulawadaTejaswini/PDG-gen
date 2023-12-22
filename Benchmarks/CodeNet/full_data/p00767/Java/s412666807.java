import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean deki=false;

		while(true) {
			deki=false;
			int tmp1=sc.nextInt();
			int tmp2=sc.nextInt();
			int g_syahen=tmp1*tmp1+tmp2*tmp2;

			if(tmp1*tmp2==0) {
				System.exit(0);
			}

			for(;; g_syahen++) {
				for(int i=1; i*i<=g_syahen; i++) {
					int ss=g_syahen-i*i;
					int bb=isHhs(ss);
					if(bb!=-1 && i<bb && ((tmp1+tmp2)!=i+bb || tmp1*tmp2!=i*bb)) {
						if(tmp1*tmp1+tmp2*tmp2<i*i+bb*bb) {
							System.out.println(i+" "+bb);
							deki=true;
							break;
						}
						else if(tmp1*tmp1+tmp2*tmp2==i*i+bb*bb) {
							if(tmp1<i) {
								System.out.println(i+" "+bb);
								deki=true;
								break;
							}
						}
					}
				}
				if(deki==true) {
					break;
				}
			}
		}
	}

	static int isHhs(int a) {
		boolean hhs=false;
		for(int i=1; i*i<=a; i++) {
			if(a==i*i) {
				hhs=true;
			}
			if(hhs==true) {
				return i;
			}
		}
		return -1;
	}
}
