import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] p=new int[N];
		int[] x=new int[N];
		int[] y=new int[N];
		int ans=0;
		for(int i=0;i<N;i++) {
			p[i]=sc.nextInt();
			if(i==p[i]) ans++;
		}
		for(int i=0;i<M;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}		
		ans=Check_digit(x,y,p,M,0,ans);

		System.out.println(ans);
	}
	static int Check_digit(int x[],int y[],int p[],int M,int i,int ans){
		int ans_tmp=0;
		int final_ans=ans;
		int tmp=p[x[i]];
		p[x[i]]=p[y[i]];
		p[y[i]]=tmp;
		for(int j=0;j<M;i++) {
			if(j==p[j]) ans_tmp++;
		}
		if(ans_tmp== ans) final_ans=ans_tmp;
		else{
			for(int k=1;k<M;k++){
				Check_digit(x,y,p,M,i,ans);
			};
		}
		return final_ans;
	}
}