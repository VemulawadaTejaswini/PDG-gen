import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int ans=0;
		int[] an=new int[n];
		
		for(int i=0;i<n;i++){
			an[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			ans=Math.max(ans,an[i+1]-an[i]);
		}
		
		System.out.println(ans);
	}
}