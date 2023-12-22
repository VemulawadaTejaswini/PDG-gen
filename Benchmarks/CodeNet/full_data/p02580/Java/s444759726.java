import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scn=new Scanner(System.in);
	     int h =scn.nextInt();
	     int w =scn.nextInt();
	     
	     
	     int t =scn.nextInt();
	  //   int [][]arr3 =new int[h][w];
	     HashMap<String ,Long> hm=new HashMap<>();
	     pair []arr =new pair[h];
	     pair[]arr2=new pair[w];
	     for(int i=0;i<h;i++){
	    	 arr[i]=new pair(i,0);
	     }
	     for(int i=0;i<w;i++){
	    	 arr2[i]=new pair(i,0);
	     }
	     while(t-->0){
	    	 int r =scn.nextInt();
	    	 int c =scn.nextInt();
	    	 String s = (r-1)+" "+(c-1);
	    	  hm.put(s, 1l);
	    	  arr[r-1].val++;
	    	  arr2[c-1].val++;
	    	 
	    	 
	     }
	      Arrays.sort(arr);
	      Arrays.sort(arr2);
	      long max=arr[0].val+arr2[0].val;
	        String s =arr[0].idx+" "+arr2[0].idx;
	        if(hm.containsKey(s)){
	        	max--;
	        }
	   System.out.println(max);

	}
	public static class pair implements Comparable<pair>{
		long val;
		int idx;
		public pair(int idx  , long val){
			 this.idx=idx;
			this.val=val;
		}
		public int compareTo(pair o){
			return (int)(o.val-this.val);
		}
	}

}