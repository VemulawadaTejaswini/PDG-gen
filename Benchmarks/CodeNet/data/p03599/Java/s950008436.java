import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		int E=sc.nextInt();
		int F=sc.nextInt();
		boolean toke=false;
		boolean[] mizu=new boolean[31];		//水　x*100gを作ることができるか
		boolean[] sato=new boolean[3001];		//砂糖 y*100gを作ることができるか
		for(int i=0; i<=30; i++) {
			mizu[i]=houteisiki(A,B,i);
			if(mizu[i]) {
				//System.out.println(i+"00 mizu");
			}
		}
		for(int i=0; i<=3000; i++) {
			sato[i]=houteisiki(C,D,i);
			if(sato[i]) {
				//System.out.println(i+" sato");
			}
		}
		int maxmz=1;
		int maxst=0;
		for(int i=A; i<=30; i++) {
			for(int j=0; j<=3000; j++) {
				if(sato[j]&&mizu[i]) {
					if((j+100*i)<=F) {		//総重量
						if(j<=i*E) {		//解けきれていますか?
							if(((long)j*(100*maxmz+maxst))-((long)maxst*(j+100*i))>0) {
								toke=true;
								maxst=j;
								maxmz=i;
							}
						}
					}
				}
			}
		}
		if(toke==true) {
			System.out.println((maxmz*100+maxst)+" "+maxst);
		}
		else {
			System.out.println(A*100+" "+0);
		}
		sc.close();
	}

	static boolean houteisiki(int a,int b,int c) {// ax+by=c;	今回はxもyも非負整数という成約有り
		int counter=0;
		while(true) {
			int tmp=c-a*counter;
			if(tmp<0) {
				return false;
			}
			else {
				if(tmp%b==0) {
					return  true;
				}
				else {
					counter++;
				}
			}
		}
	}
}