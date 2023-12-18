
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		final int n=sc.nextInt();
		final int k=sc.nextInt();
		
		ArrayList<Integer> a=new ArrayList();
		ArrayList<Integer> s=new ArrayList();
		
		int sum=0;
		
		for(int i=0;i<n;i++){
			int m=sc.nextInt();
			a.add(m);
			sum=sum+m;
			s.add(sum);
			
		}
		
		int count=0;
		
		for(int i=1;i<k;i++){
			count=count+search(a,s,0,i-1,k);
			
		}
		
		System.out.println(count);
		
		
		
	}
   public static int search(ArrayList<Integer> a, ArrayList<Integer> s,int start,int end, int k){
	   int thiscount=0;
	   if(start==end){
		   if(a.get(start)%k==1)thiscount++;
	   }else if(start==0){
		   if((s.get(end))%k==(end+1))thiscount++;
	   }else if((s.get(end)-s.get(start-1))%k==(end-start+1)){
		   thiscount++;
	   }
	   if(end==a.size()-1)return thiscount;
	   return thiscount+search(a,s,start+1,end+1,k);
	  
   }
	

}
