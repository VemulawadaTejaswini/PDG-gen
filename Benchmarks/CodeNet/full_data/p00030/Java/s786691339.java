import java.util.*;
import java.lang.*;


class Main{




	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int N,s;
		while(true){
			N = in.nextInt();
			s = in.nextInt();
			if(N+s == 0)break;		//N 工数　S　和　　終了処理
			int cnt=0;		//
			for(int i=0;i<=9;i++){
				if(N <= 0)break;
				if(i == s && N == 1)cnt++;		//	1項がわならカウント　N=1
				for(int j=0;j<=9;j++){
					if(N <= 1)break;		//N1ik owari
					if(i == j)continue;
					if(i+j == s && N == 2)cnt++;		//2kou wa 
					for(int k=0;k<=9;k++){
						if(N <= 2)break;
						if(k==i||k==j)continue;		//k ga i or 
						if(i+j+k == s && N == 3)cnt++;
						for(int l=0;l<=9;l++){
							if(N <= 3)break;
							if(l==i||l==j||l==k)continue;
							if(i+j+k+l == s && N == 4)cnt++;
							for(int m=0;m<=9;m++){
								if(N <=4 )break;
								if(m==i||m==j||m==k||m==l)continue;
								if(i+j+k+l+m == s && N== 5)cnt++;
								for(int n=0;n<=9;n++){
									if(N <=5 )break;
									if(n==i||n==j||n==k||n==l||n==m)continue;
									if(i+j+k+l+m+n == s && N == 6)cnt++;
									for(int o=0;o<=9;o++){
										if(N <=6 )break;
										if(o==i||o==j||o==k||o==l||o==m||o==n)continue;
										if(i+j+k+l+m+n+o == s && N == 7)cnt++;
										for(int p=0;p<=9;p++){
											if(N <=7 )break;
											if(p==i||p==j||p==k||p==l||p==m||p==n||p==o)continue;
											if(i+j+k+l+m+n+o+p == s & N == 8)cnt++;
											for(int q=0;q<=9;q++){
												if(N <=8 )break;
												if(q==i||q==j||q==k||q==l||q==m||q==n||q==o||q==p)continue;
												if(i+j+k+l+m+n+o+p+q == s & N == 9)cnt++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			int div=1;
			for(int i=2;i<=N;i++)div*=i;
			System.out.println(cnt/div);
		}

	}
	//funny
}
