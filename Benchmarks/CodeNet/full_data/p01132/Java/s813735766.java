import java.util.Scanner;

public class Main{
	static int [] k = {500,100,50,10};
	static int [] backk = new int[4];
	static int back(int b) {
		int count = 0;
		for(int i=0;i<4;i++) {
			count += b/k[i];
			backk[i] = b/k[i];
			b = b%k[i];
		}
		return count;
	}
	
	static boolean check(int i,int j,int k,int l) {
		if( (i!=0 && backk[0]!=0) || (j!=0 && backk[1]!=0) || (k!=0 && backk[2]!=0) || (l!=0 && backk[3]!=0) ){
			return false; 
		}else {
			return true;
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		while(true) {
			int [] purse = new int[4];
			int [] ans = new int[4];
			int sum = 0;
			for(int i=0;i<4;i++) {
				purse[i] = sc.nextInt();
			}
			int min = 80;
			for(int i=0;i<=purse[3];i++) {
				for(int j=0;j<=purse[2];j++) {
					for(int k=0;k<=purse[1];k++) {
						for(int l=0;l<=purse[0];l++) {
							int pay = 500*i + 100*j + 50*k + 10*l;
							if(pay>=p) {
								int b = pay - p;
								if(back(b)-(i+j+k+l)<min) {
									if(check(i,j,k,l)) {
										min = back(b)-(i+j+k+l);
										ans[0] = l;
										ans[1] = k;
										ans[2] = j;
										ans[3] = i;
									}
									
								}
							}
						}
					}
				}
			}
			for(int i=0;i<4;i++) {
				if(ans[i]!=0) {
					System.out.println(k[3-i]+" "+ans[i]);
				}
			}
			p = sc.nextInt();
			if(p!=0) {
				System.out.println();
			}else {
				return;
			}
			
		}
	}
}

