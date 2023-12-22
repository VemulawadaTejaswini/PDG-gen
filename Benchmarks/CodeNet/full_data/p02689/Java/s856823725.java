import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		List<Integer>list=new ArrayList<Integer>();
		Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			
			list.add(a);
		}
		
		//ここまでで高さの入力
		
		for(int i=0;i<m;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			if(list.get(a-1)>list.get(b-1)){
				set.add(a-1);
			}
			else{
				set.add(b-1);
			}
			
		}
		
		System.out.println(set.size());
	}
}