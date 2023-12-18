import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
  		
  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
    	}
  
        int count=0;
  
       count+=(n-1)/(k-1);
       if((n-1)%(k-1)!=0){
       count++;
       }
       
  
    	System.out.println(count);
    }
}
