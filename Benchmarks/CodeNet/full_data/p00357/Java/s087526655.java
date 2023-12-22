import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tmpsu=sc.nextInt();
		int[] iki_tmp=new int[tmpsu];
		int[] kae_tmp=new int[tmpsu];
		int[] iki_V=new int[tmpsu];
		int[] kae_V=new int[tmpsu];

		for(int i=0; i<tmpsu; i++) {
			iki_tmp[i]=sc.nextInt();
			kae_tmp[tmpsu-1-i]=iki_tmp[i];
			iki_V[i]=0;
			kae_V[i]=0;
		}

		iki_V[0]=1;
		kae_V[0]=1;
		for(int i=0; i<tmpsu; i++) {
			if(iki_tmp[i]<10) {
				//
			}
			else {
				for(int j=1; j<=(iki_tmp[i])/10; j++) {
					int tmp=j+i;
					if(j+i>=tmpsu) {
						break;
					}
					else {
						iki_V[j+i]++;
					}
				}
			}
		}
		for(int i=0; i<tmpsu; i++) {
			if(kae_tmp[i]<10) {
				//
			}
			else {
				for(int j=1; j<=(kae_tmp[i])/10; j++) {
					int tmp=j+i;
					if(j+i>=tmpsu) {
						break;
					}
					else {
						kae_V[j+i]++;
					}
				}
			}
		}

		for(int i=0; i<tmpsu; i++) {
			if(kae_V[i]==0 || iki_V[i]==0) {
				System.out.println("no");
				System.exit(0);
			}
		}
		System.out.println("yes");
	}


}
