
import java.util.*;

class Main{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt(),n=sc.nextInt();
		
		List<Integer>p=new ArrayList<>();
		
		for(int i=0;i<n;i++)
			p.add(sc.nextInt());
			
		
		int ans=0,min=150;
		//minはカンスト値の半分
		
		
		for(int i=-100;i<=200;i++){
			if(!p.contains(i)&&Math.abs(i-x)<min){
				ans=i;
				min=Math.abs(i-x);
			}
		}
		System.out.print(ans);
	}
}