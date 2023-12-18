import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[] k=new long[N];
		for(int i=0; i<N; i++) {
			k[i]=sc.nextLong();
		}

		for(int i=1; i<N; i++) {
			k[i]=k[i-1]+k[i];
		}
		long counter=0;
		if(k[0]>0) {
			counter=1;
		}
		else {
			counter=-1;
		}

		long[] tasu=new long[N];
		long kaz=0;
		for(int i=0; i<N; i++) {
			tasu[i]=0;
		}

		for(int i=0; i<N; i++) {
			long tmp=counter*(k[i]+tasu[i]);
			if(tmp>0) {
				//条件を満たすのでOK
			}
			else if(tmp<0){
				if((k[i]+tasu[i])>0) {
					long tt=(k[i]+tasu[i])+1;
					kaz+=tt;
					tasu[i]-=tt;
				}
				else if((k[i]+tasu[i])<0) {
					long tt=((k[i]+tasu[i])-1)*-1;
					kaz+=tt;
					tasu[i]+=tt;
				}
			}
			else if(tmp==0) {
				if(counter==-1) {
					tasu[i]--;
				}
				else if(counter==1) {
					tasu[i]++;
				}
				kaz++;
			}
			if(i!=N-1) {
				tasu[i+1]=tasu[i];
			}
			counter*=-1;
		}

		long m_kaz=0;

		if(k[0]>0) {
			counter=-1;
		}
		else {
			counter=1;
		}
		for(int i=0; i<N; i++) {
			long tmp=counter*(k[i]+tasu[i]);
			if(tmp>0) {
				//条件を満たすのでOK
			}
			else if(tmp<0){
				if((k[i]+tasu[i])>0) {
					long tt=(k[i]+tasu[i])+1;
					m_kaz+=tt;
					tasu[i]-=tt;
				}
				else if((k[i]+tasu[i])<0) {
					long tt=((k[i]+tasu[i])-1)*-1;
					m_kaz+=tt;
					tasu[i]+=tt;
				}
			}
			else if(tmp==0) {
				if(counter==-1) {
					tasu[i]--;
				}
				else if(counter==1) {
					tasu[i]++;
				}
				m_kaz++;
			}
			if(i!=N-1) {
				tasu[i+1]=tasu[i];
			}
			counter*=-1;
		}
		System.out.println(Math.min(kaz,m_kaz));
	}
}