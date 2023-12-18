import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int kazu=0;
		
		
		Set<Integer> s=new HashSet<Integer>();
	    
		int[] numsize=new int[n];
		for(int i=0;i<n;i++)
			numsize[i]=0;
		
		
		int[][] hn=new int[n][2];
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			hn[i][1]=a;
			hn[i][0]=i+1;
		}
		
		for(int i=0;i<m;i++){
			int num=sc.nextInt();
			int num2=sc.nextInt();
			
			numsize[num-1]=1;
			numsize[num2-1]=1;
			if(hn[num-1][0]<hn[num2-1][0]){
				s.add(num-1);
			}
		}
		
		for(int i=0;i<m;i++){
			if(numsize[i]==0)kazu++;
		}
		
		
		System.out.println(s.size()+kazu);
	}
}