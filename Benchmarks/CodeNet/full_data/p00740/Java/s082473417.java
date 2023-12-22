import java.util.*;
public class Main {
	int[] N;
	int n,p;
	Main(){
		n=-1;p=-1;
	}
		void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			n=sc.nextInt();
			p=sc.nextInt();
			if(n==0&&p==0)break;
			N=new int[n];
			Arrays.fill(N,0);
			System.out.print(solve(0,p));
		}
	}
		int solve(int current,int remains){
			while(true){
				if(remains==1&&N[current]+1==p)return current;
				if(remains==0){
					remains=N[current]+1;
					N[current]=0;
				}
				else{
					N[current]+=1;
				}
				current=(current+1)%n;
				remains=remains-1;
				for(int i=0;i<n;i++){
					//System.out.print(N[i]+" ");
				}
				//System.out.println();
			}
		}
	public static void main(String[] args) {
		new Main().run();
	}
}