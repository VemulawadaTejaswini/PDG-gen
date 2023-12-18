import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> dlist=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			dlist.add(sc.nextInt());
		}
		Collections.sort(dlist);
		int m=sc.nextInt();
		int[] t=new int[m];
		boolean is=true;
		for(int i=0;i<m;i++){
			t[i]=sc.nextInt();
		}
		Arrays.sort(t);
		if(n<m){
			is=false;
		}

		for(int i=0;is&&i<m;i++){
			int start=0,end=dlist.size()-1;
			int mid;
			while(true){
				mid=(start+end)/2;
				if(dlist.get(mid)==t[i]){
					dlist.remove(mid);
					break;
				}
				if(dlist.get(mid)<t[i]){
					start=mid+1;
				}
				else{
					end=mid;
				}
				if(start<0||end>n-1||start==end){
					is=false;
					break;
				}
			}
		}
		if(is){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
