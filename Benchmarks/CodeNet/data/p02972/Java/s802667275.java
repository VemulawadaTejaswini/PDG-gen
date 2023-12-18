
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		HashSet<Integer> set =new HashSet<>();
		int []arr=new int[n+1];
		for(int i=1;i<=n;i++) {
			int x=scn.nextInt();
			arr[i]=x;
			if(i>=n/2+1&&arr[i]==1) {
				set.add(i);
			}
		}
		for(int j=n/2;j>=2;j--) {
			int sum=0;
			for(int i=2;i<=n/2;i++) {
				//System.out.println(i+" "+j);
				if(i*j<=n) {
					if(set.contains(i*j))
					sum+=1;
				}else {
					break;
				}
			}
			if((sum%2==0&&arr[j]==1)||(sum%2==1&&arr[j]==0)) {
				//System.out.println(sum+" sum");
				set.add(j);
			}
		}
		if((set.size()%2==0&&arr[1]==1)||(set.size()%2!=0&&arr[1]==0)) {
			set.add(1);
		}
		System.out.println(set.size());
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
