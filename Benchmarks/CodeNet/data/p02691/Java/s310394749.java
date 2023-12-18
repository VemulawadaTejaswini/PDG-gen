import java.util.*;

public class Main {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int N=sc.nextInt();
		 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		 for(int i=0;i<N;i++)
			 map.put(i,sc.nextInt());
	     sc.close();
	     int p[]=new int[N];
	     int s[]=new int[N];
	     for(int i=0;i<N;i++) {
	    	 p[i]=i+map.get(i);
	    	 s[i]=i-map.get(i);
	     }
	     int count=0;
	     for(int i=0;i<N;i++) {
	    	 for(int j=0;j<N;j++) {
	    		 if(p[i]==s[j]) {
	    			 count++;
	    		 }
	    	 }
	     }
	     System.out.println(count);
	     
	 }
}
