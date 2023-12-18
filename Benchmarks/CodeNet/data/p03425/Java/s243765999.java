import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ninzu=sc.nextInt();
		int[] march_count=new int[5];
		String moji="";
		for(int i=0; i<ninzu; i++) {
			moji=sc.next();
			if(moji.charAt(0)=='M') {
				march_count[0]++;
			}
			else if(moji.charAt(0)=='A') {
				march_count[1]++;
			}
			else if(moji.charAt(0)=='R') {
				march_count[2]++;
			}
			else if(moji.charAt(0)=='C') {
				march_count[3]++;
			}
			else if(moji.charAt(0)=='H') {
				march_count[4]++;
			}
		}
		//MARCHから選ぶとおりは5C3
		int[] sets=new int[10];
		int ks=0;
		for(int i=0; i<32; i++) {
			int counter=0;
			int tmp=i;
			while(tmp>0) {
				if(tmp%2==1) {
					counter++;
				}
				tmp=tmp/2;
			}
			if(counter==3) {
				sets[ks]=i;
				ks++;
			}
		}

		long toori=0l;
		long toori_tmp=0l;
		long[] aa=new long[5];
		long[] waru= {16,8,4,2,1};

		for(int i=0; i<10; i++) {
			toori_tmp=1l;
			for(int j=0; j<5; j++) {
				aa[j]=((sets[i]/waru[j])%2)*march_count[j];
				if((sets[i]/waru[j])%2==1) {
					toori_tmp*=aa[j];
				}
			}
			toori+=toori_tmp;
		}
		System.out.println(toori);
	}
}