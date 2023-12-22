import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tmpsu=sc.nextInt();
		int[] iki_tra=new int[tmpsu];		// kae_tra,iki_traはトランポリンの飛べる距離
		int[] kae_tra=new int[tmpsu];		//kae_traはiki_traをひっくり返したもの
		int iki_toutatuka=0;
		int kae_toutatuka=0;


		for(int i=0; i<tmpsu; i++) {
			iki_tra[i]=sc.nextInt();
			kae_tra[tmpsu-1-i]=iki_tra[i];
		}

		for(int i=0; i<tmpsu; i++) {
			if(iki_tra[i]<10) {
				//
			}
			else {
				int tmp=i+iki_tra[i]/10;
				if(tmp>iki_toutatuka) {
					iki_toutatuka=tmp;
				}
			}
		}
		for(int i=0; i<tmpsu; i++) {
			if(kae_tra[i]<10) {
				//
			}
			else {
				int tmp=i+kae_tra[i];
				if(tmp>kae_toutatuka) {
					kae_toutatuka=tmp;
				}
			}
		}

		if(iki_toutatuka>=tmpsu-1 && kae_toutatuka>=tmpsu-1) {
		System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
