//package ABC167;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		long k=sc.nextLong();
		
		int[] a=new int[n];
		int[] check=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		ArrayList<Integer> list=new ArrayList<>();
		int cur=1;
		int rec=1;
		//list.add(1);
		check[0]=1;
		while(true){
			
			if(check[cur-1]>1){
				int prev=check[cur-1];
				int hoge=(int)((k-prev+1)%(rec-prev));
				int ans=list.get(prev+hoge-2);
				System.out.println(ans);
				break;
			}
			else {
				check[cur-1]=rec;
				cur=a[cur-1];
				rec++;
				list.add(cur);
				//System.out.println(cur);
			}
		}
		
		
		
	}

}
