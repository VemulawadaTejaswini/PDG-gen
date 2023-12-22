
import java.util.*;

import java.math.*;

public class Main {
	
    public static long solve(int[] arr1,int[] arr2, int k) {
    	
    	Queue<Integer> a1=new LinkedList<>();
    	Queue<Integer> a2=new LinkedList<>();
    	long ans=0;
    	long cc=0;
    	for(int u:arr1)
    		a1.add(u);
      	for(int u:arr2)
    		a2.add(u);
      	boolean up=true;
      	while(ans<=k && up) {
      		 up=false;
      		if(a1.size()==0 || a2.size()==0)
      			break;
      		if(a1.peek()<=a2.peek()) {
      		if(a1.peek()+ans<=k) {
      			ans+=a1.poll();
      			cc++;
      			up=true;
      		}
      		}else {
      			if(a2.peek()+ans<=k) {
          			ans+=a2.poll();
          			cc++;
          			up=true;
          		}
      		}

      	}
      	while(a1.size()>0) {
      		if(a1.peek()+ans<=k) {
      			ans+=a1.poll();
      			cc++;
      		}else break;
      	}
    	while(a2.size()>0) {
      		if(a2.peek()+ans<=k) {
      			ans+=a2.poll();
      			cc++;
      		}else break;
      	}
    	
    	return cc;
    }
	
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		int t=1;
		while(t-->0) {
			int n=s.nextInt();
			int m=s.nextInt();
			int k=s.nextInt();
			int[] arr1=new int[n];
			int[] arr2=new int[m];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i]=s.nextInt();
			}
			for (int i = 0; i < arr2.length; i++) {
				arr2[i]=s.nextInt();
			}
			System.out.println(solve(arr1,arr2,k));
		}
		
		
	}
}
    
