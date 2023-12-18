import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		int [] arr =new int[n];
	      for(int i=0;i<arr.length;i++){
	    	  arr[i]=scn.nextInt();
	      }
	      res(arr);

	}
	public static void res(int [] arr){
		long tsum=0;
		HashMap<Integer,pair> hm =new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				pair p = hm.get(arr[i]);
				int f =p.f;
				f++;
				long val =(f*(f-1))/2;
				hm.put(arr[i], new pair(f,val));
			}else{
				hm.put(arr[i], new pair(1,0));
			}
		}
		for(int val :  hm.keySet()){
			tsum+=hm.get(val).sum;
		}
		for(int i=0;i<arr.length;i++){
		    pair p=hm.get(arr[i]);
		    int f = p.f;
		    ///long s=p.sum;
		    long res =tsum-p.sum;
		    f--;
		    res+=(f*(f-1))/2;
		    System.out.println(res);
		    
		    
		}
	}
	
	public static class pair{
		int f;
		long sum;
		public pair(int f ,long sum){
			this.f=f;
			this.sum=sum;
		}
	}

}