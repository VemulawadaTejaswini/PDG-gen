import java.util.*;


class Main{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		LinkedList<String> kinds = new LinkedList<>();
		
		int ans=0;
		
		for(int i=0;i<n;i++){
			String tmp = sc.next();
			if(kinds.contains(tmp)==false){
			  kinds.add(tmp);
			  ans++;
			  }
		}
		
		
		
		System.out.print(ans);
	}
}
	


