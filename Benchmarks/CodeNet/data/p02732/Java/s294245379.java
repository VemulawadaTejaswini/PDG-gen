
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void f(){
		long ans=0;
		int x=0;
		for(int t:map.keySet()){
			x=map.get(t);
			if(x!=0){
				ans+=((x*(x-1))/2);
			}
		}
		System.out.println(ans);
	}
	public static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			map.put(arr[i], map.containsKey(arr[i])?map.get(arr[i])+1:1);
		}
		for(int i=0;i<n;i++){
			map.put(arr[i],map.get(arr[i])-1);
			f();
			map.put(arr[i],map.get(arr[i])+1);
		}
	}
}
