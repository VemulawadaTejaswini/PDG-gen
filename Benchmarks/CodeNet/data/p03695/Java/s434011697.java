import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
  		int[] a=new int[9];
		int ans=0;
		
		for(int i=0;i<n;i++){
    		int b=sc.nextInt();
            if(b<3200){
                a[b/400]++;
            }else{
          	    a[8]++;
            }
    	}
        
  		for(int i=0;i<8;i++){
        	if(a[i]>0){
                ans++;
            }
        }
        
        System.out.print(Math.max(ans,1)+" ");
     	System.out.println(ans+a[8]);
   }
}
