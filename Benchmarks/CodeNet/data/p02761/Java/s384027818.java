import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean col=true;
		int[] preAns=new int[n];
		preAns[0]=1;				
		boolean[] PAalre=new boolean[n];

		int s;
		int c;
		for(int i=0;i<m;i++){
			s= sc.nextInt()-1;
			c= sc.nextInt();
				if(PAalre[s]){
					if(c!=preAns[s]){
						col=false;
					}
				}else{
					PAalre[s]=true;
					preAns[s]=c;
				}	
		}
		if(preAns[0]==0&&n!=1){
			col=false;
		}
		if(col){
			String ans="";
			for(int i=0;i<n;i++){
				ans=ans+preAns[i];
			}
			System.out.println(ans);
		}else{
			System.out.println(-1);
		}
	}
}