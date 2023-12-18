import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		List<Integer>list=new ArrayList<Integer>();
		//Set<Integer>set=new HashSet<Integer>();
		
		int[] hight=new int[n];
		boolean[] jugbe=new boolean[n];
		
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			
			hight[i]=a;
		}
		
		//ここまでで高さの入力
		
		for(int i=0;i<m;i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			
			if(hight[a]<=hight[b]){
				jugbe[a]=true;
			}
			else if(hight[a]>=hight[b]){
				jugbe[b]=true;
			}
		}
			
			int count=0;
			
			for(int i=0;i<n;i++){
				if(!jugbe[i])count++;
			}
		
		
		System.out.println(count);
	}
}