import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int  n =scn.nextInt();
		int m =scn.nextInt();
		long k =scn.nextLong();
		long [] arr =new long[n];
		long [] arr2 =new long[m];
		
		long count=0;
		
		for(int i=0;i<arr.length;i++){
			
			arr[i]=scn.nextLong();
			
			
		}
	
		for(int i=0;i<arr2.length;i++){
			arr2[i]=scn.nextLong();
			
		}
		long sum=0;
		
		int idx1=-1;
		int idx2=-1;
		for(int i=0;i<arr.length;i++){
			if(sum+arr[i]<=k){
				sum+=arr[i];
				idx1=i;
			}else{
				break;
			}
		}
		for(int i=0;i<arr2.length;i++){
			if(sum+arr2[i]<=k){
				sum+=arr2[i];
				idx2=i;
			}else{
				break;
			}
		}
		
		
		count=idx1+1+idx2+1;
		idx2++;
		while(idx2<arr2.length ){
			if(idx1>=0){
				sum-=arr[idx1];
				idx1--;
			}
		     while(idx2<arr2.length && sum+arr2[idx2]<=k){
		    	
		    	 sum+=arr2[idx2];
		    	 count=Math.max(count, (idx1+1)+idx2+1);
		    	 idx2++;
		    	 
		     }
		   
		     if(idx1<0){
		    	 break;
		     }
		     
		}
	
    
     
		System.out.println(count);

	}

}