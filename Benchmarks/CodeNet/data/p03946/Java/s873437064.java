import java.util.*;

public class Main{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args){
		int n=readInt();
		int t=readInt();
		int[] a=new int[n];
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			a[i]=readInt();
			map.put(a[i],i);
		}
		int min=a[0];
		int diff=0;
		for(int i=1;i<n;i++){
			if(diff<a[i]-min)
				diff=a[i]-min;
			if(min>a[i])
				min=a[i];
		}
		int ans=0;
		for(int i=0;i<n;i++){
			Integer x=map.get(a[i]+diff);
			if(x!=null&&i<x)
				ans++;
		}
		System.out.println(ans);
	}
	
	private static int readInt(){
		return Integer.parseInt(sc.next());
	}
}