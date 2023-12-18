import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n =scn.nextInt();
		HashMap<Integer,HashSet<Integer>> hm = new HashMap<>();
		int m =scn.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		while(m-->0){
			int a =scn.nextInt();
			int b= scn.nextInt();
			if(hm.containsKey(a)){
				HashSet<Integer> hs = hm.get(a);
				hs.add(b);
			}else{
				HashSet<Integer> hs = new HashSet<>();
				hs.add(b);
				hm.put(a, hs);
			}
			if(hm.containsKey(b)){
				HashSet<Integer> hs = hm.get(b);
				hs.add(a);
			}else{
				HashSet<Integer> hs = new HashSet<>();
				hs.add(a);
				hm.put(b, hs);
			}
			
		}
		int cnt=0;
		for(int i=0;i<n;i++){
		    if(hm.containsKey(i+1)){
		    	HashSet<Integer> hs = hm.get(i+1);
		    	boolean f=false;
		    	for(int val : hs){
		    		if(arr[val-1]>arr[i]){
		    			f=true;
		    			break;
		    		}
		    	}
		    	if(f){
		    		cnt++;
		    	}
		    }else{
		    	cnt++;
		    }
		}
		System.out.println(cnt);

	}

}