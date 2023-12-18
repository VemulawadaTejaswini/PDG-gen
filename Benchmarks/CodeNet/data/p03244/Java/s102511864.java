import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int n=N/2;
				
		int	SetO[]=new int [n];
		int SetE[]=new int [n];
				
		for(int i=0;i<n;i++) {
			SetO[i]=sc.nextInt();
			SetE[i]=sc.nextInt();
		}
				
		int [] maxO=new int[4];
		maxO=max(SetO,n);
		int [] maxE=new int[4];
		maxE=max(SetE,n);
				
		if(maxO[0]==maxE[0]) {
			if((n - maxO[1] + n - maxE[3]) < (n - maxE[1] + n - maxO[3])) // 條件是這樣
				System.out.println(n - maxO[1] + n - maxE[3]);
			else
				System.out.println(n - maxO[3] + n - maxE[1]);
		}
		else
			System.out.println(n - maxO[1] + n - maxE[1]);
					
	}
			
			
	public static int[] max (int [] set,int n) {
		int max=0;
		int maxv=0;
		int maxS=0;
		int maxSv=0;		
		int [] re=new int[4];
				
		int count[]=new int [100001];
		/* JAVA 裡陣列初始值已經是 0
		for(int i=0;i<100001;i++) {
			count[i]=0;
		}
		*/

		for(int j=0;j<n;j++) {
			/*
			for(int f=1;f<10001;f++) {
				if(set[j]==f)
					count[f]++;
			}
			*/
			//等同於直接這樣寫
			count[set[j]]++;
		}
			
		//直接找最多次的值
		for(int i=0;i<=100000;i++) {
			if(count[i]>count[maxv])
				maxv=i;
		}
		//選出出現最多次的值
		/*
			for(int f=0;f<100000;f++) {
				if(count[f]==max)
					maxv=f;
			}
		*/
			
		//直接找次多的值
		for(int i=0;i<=100000;i++) {
			if(count[i]>count[maxSv] && i != maxv)
				maxSv=i;
		}
				
		//選出次數第二多的值
		/*
		for(int i=0;i<100000;i++) {
			if(count[i]==maxS)
				maxSv=i;
		}
		*/
		re[0]=maxv;
		re[1]=count[maxv];
		re[2]=maxSv;
		re[3]=count[maxSv];
		return re;
	}	
}


