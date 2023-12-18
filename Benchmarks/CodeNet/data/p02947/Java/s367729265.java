import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String s[]=new String[N];
		boolean flag[]=new boolean[N];
		for(int i=0;i<N;i++) {
			s[i]=sc.next();
			flag[i]=true;
		}
		sc.close();
		char[] c=new char[] {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		int[] cn=new int[] {1,1,1,1,1,1,1,1,1,1};
		int cns=0;
		int count=0;
		int counted=1;
		long counts=0;
		for(int j=0;j<N;j++) {
			if(flag[j]) {
				flag[j]=false;
				for(int k=0;k<10;k++) {
					c[k]=s[j].charAt(k);
					for(int l=k+1;l<10;l++) {
						if(c[k]==s[j].charAt(l)&&cn[k]!=0) {
							cn[k]++;
							cn[l]=0;
						}
					}
					for(int m=j+1;m<N;m++) {
						if(flag[m]) {
							for(int n=0;n<10;n++) {
								for(int o=0;o<10;o++) {
									if(c[n]==s[m].charAt(o)&&cn[n]!=0) {
										cn[n]--;
									}
								}
							}
						for(int p=0;p<10;p++) {
							cns+=cn[p];
						}
						if(cns==0) {
							flag[m]=false;
							count++;
						}
					}
				}
				for(int q=1;q<=count;q++) {
					counted*=q;
				}
				counts=counts+counted/2;
				c=new char[] {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
				cn=new int[] {1,1,1,1,1,1,1,1,1,1};
				cns=0;
				count=0;
				counted=1;
				}
			}
		}
	}
}